package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.For;
import es.uniovi.dlp.ast.statements.IfElse;
import es.uniovi.dlp.ast.statements.Return;
import es.uniovi.dlp.ast.statements.While;
import es.uniovi.dlp.ast.types.FunctionType;
import es.uniovi.dlp.ast.types.RecordType;

public class OffSetVisitor extends AbstractVisitor<Void, Void> {

    private int sumOffsetGlobalVariables = 0;
    private int sumOffsetLocalVariables = 0;

    @Override
    public Void visit(FuncDefinition fDef, Void param) {
        fDef.type.accept( this, param );

        sumOffsetLocalVariables = 0;

        for (var stmt : fDef.statements) {
            stmt.accept(this, param);
        }
        fDef.bytesLocalsSum = sumOffsetLocalVariables;
        return null;
    }

    @Override
    public Void visit(VarDefinition def, Void param) {
        def.type.accept( this, param );
        if (def.scope == 0) {
            def.offset = sumOffsetGlobalVariables;
            sumOffsetGlobalVariables += def.type.numberOfBytes();
        } else {
            sumOffsetLocalVariables += def.type.numberOfBytes();
            def.offset = -sumOffsetLocalVariables;
        }
        return param;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        ifElse.condition.accept( this, param );
        int currentLocalBytes = sumOffsetLocalVariables;
        for (var stmt : ifElse.ifBody) {
            stmt.accept( this, param );
        }
        ifElse.ifBytesLocalsSum = sumOffsetLocalVariables - currentLocalBytes;
        sumOffsetLocalVariables = currentLocalBytes;

        for (var stmt : ifElse.elseBody) {
            stmt.accept(this, param);
        }
        ifElse.elseBytesLocalsSum = sumOffsetLocalVariables - currentLocalBytes;
        sumOffsetLocalVariables = currentLocalBytes;

        return null;
    }

    @Override
    public Void visit(While whileStmt, Void param) {
        int currentLocalBytes = sumOffsetLocalVariables;
        super.visit(whileStmt, param);
        whileStmt.bytesLocalsSum = sumOffsetLocalVariables - currentLocalBytes;
        sumOffsetLocalVariables = currentLocalBytes;

        return null;
    }

    @Override
    public Void visit(For forStmt, Void param) {
        int currentLocalBytes = sumOffsetLocalVariables;
        super.visit(forStmt, param);
        forStmt.bytesLocalsSum = sumOffsetLocalVariables - currentLocalBytes;
        sumOffsetLocalVariables = currentLocalBytes;

        return null;
    }

    @Override
    public Void visit(Return stmt, Void param) {
        stmt.currentReservedBytes = sumOffsetLocalVariables;
        super.visit(stmt, param);
        return null;
    }

    @Override
    public Void visit(FunctionType t, Void param) {
        int paramBytesSum = 0;
        for (int i = t.arguments.size() - 1; i >= 0; i--) {
            t.arguments.get( i ).accept( this, param );
            var arg = t.arguments.get(i);
            arg.offset = 4 + paramBytesSum;
            paramBytesSum += arg.type.numberOfBytes();
        }
        t.bytesParamsSum = paramBytesSum;
        t.returnType.accept( this, param );

        return null;
    }

    @Override
    public Void visit(RecordType t, Void param) {
        int fieldsBytesSum = 0;
        for (var field : t.fields) {
            field.accept(this, param);
            field.offset = fieldsBytesSum;
            fieldsBytesSum += field.type.numberOfBytes();
        }

        return null;
    }
}
