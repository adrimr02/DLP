package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.TypeDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.FunctionType;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.VoidType;
import es.uniovi.dlp.util.CodeGenerator;

public class ExecuteCGVisitor extends AbstractCGVisitor<FuncDefinition, Void> {

    private final AddressCGVisitor av;
    private final ValueCGVisitor vv;

    public ExecuteCGVisitor(CodeGenerator cg) {
        super(cg);
        av = new AddressCGVisitor( cg );
        vv = new ValueCGVisitor( cg, av );
    }

    public Void visit(Program program, FuncDefinition param) {

        cg.call( "main" );
        cg.halt();

        cg.comment("* Type definitions");
        for (var def : program.definitions)
            if (def instanceof TypeDefinition)
                def.accept( this, param );

        cg.comment( "* Global variables" );
        for (var def : program.definitions)
            if (def instanceof VarDefinition)
                def.accept( this, param );

        cg.comment( "* Functions" );
        for (var def : program.definitions)
            if (def instanceof FuncDefinition)
                def.accept( this, param );

        return null;
    }

    public Void visit(TypeDefinition tdef, FuncDefinition param) {
        cg.debugType(tdef);
        return null;
    }

    public Void visit(VarDefinition vdef, FuncDefinition param) {
        cg.comment( "* " + vdef);
        if (vdef.scope == 0)
            cg.debugGlobalVariable(vdef.name, vdef.getType());
        else {
            cg.debugLocalVariable(vdef.name, vdef.getType());
            cg.enter(vdef.type.numberOfBytes());
        }
        return null;
    }

    public Void visit(FuncDefinition fdef, FuncDefinition param) {
        cg.debugFunction(fdef);
        cg.label( fdef.name );
        cg.comment( "* Local Variables" );

        for (var stmt :  fdef.statements) {
            stmt.accept(this, fdef);
            if (stmt instanceof Return)
                return null;
        }

        if (((FunctionType) fdef.type).returnType instanceof VoidType)
            cg.ret(0, fdef.bytesLocalsSum, ((FunctionType) fdef.type).bytesParamsSum);

        return null;
    }

    public Void visit(Assignment stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        stmt.left.accept( this.av, null );
        stmt.right.accept( this.vv, null );

        cg.store(stmt.left.getType().getSuffix());

        return null;
    }

    public Void visit(UnaryOperator stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        stmt.target.accept( this.av, null );
        stmt.target.accept( this.vv, null );

        cg.pushi(1);

        if (!(stmt.target.getType() instanceof IntType))
            cg.convert( IntType.getInstance(), stmt.target.getType() );

        switch (stmt.operator) {
            case "++" -> cg.add(stmt.target.getType().getSuffix());
            case "--" -> cg.sub(stmt.target.getType().getSuffix());
        }

        cg.store(stmt.target.getType().getSuffix());

        return null;
    }

    public Void visit(AssignmentOperator stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        stmt.left.accept( this.av, null );
        stmt.left.accept( this.vv, null );
        stmt.right.accept( this.vv, null );

        switch (stmt.operator) {
            case "+=" -> cg.add(stmt.left.getType().getSuffix());
            case "-=" -> cg.sub(stmt.left.getType().getSuffix());
            case "*=" -> cg.mul(stmt.left.getType().getSuffix());
            case "/=" -> cg.div(stmt.left.getType().getSuffix());
            case "%=" -> cg.mod(stmt.left.getType().getSuffix());
        }

        cg.store(stmt.left.getType().getSuffix());

        return null;
    }

    public Void visit(Input stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        stmt.expression.accept(this.av, null);
        cg.in(stmt.expression.getType().getSuffix());
        cg.store(stmt.expression.getType().getSuffix());

        return null;
    }

    @Override
    public Void visit(Print stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        stmt.expression.accept(this.vv, null);
        cg.out(stmt.expression.getType().getSuffix());

        return null;
    }

    @Override
    public Void visit(IfElse ifElse, FuncDefinition param) {
        cg.debugLine(ifElse.getLine());
        int labels = cg.getLabels(2);
        int elseL = labels + 1;
        int endL = labels + 2;

        ifElse.condition.accept( vv, null );
        cg.jz("label"+elseL);
        for (var stmt : ifElse.ifBody) {
            stmt.accept(this, param);
            if (stmt instanceof Return)
                break;
        }
        if (ifElse.ifBytesLocalsSum != 0)
            cg.enter(-ifElse.ifBytesLocalsSum);
        cg.jump( "label"+endL );
        cg.label( "label"+elseL );
        for (var stmt : ifElse.elseBody) {
            stmt.accept(this, param);
            if (stmt instanceof Return)
                break;
        }
        if (ifElse.elseBytesLocalsSum != 0)
            cg.enter(-ifElse.elseBytesLocalsSum);
        cg.label( "label"+endL );
        return null;
    }

    @Override
    public Void visit(While whileStmt, FuncDefinition param) {
        cg.debugLine(whileStmt.getLine());
        int labels = cg.getLabels(2);
        int conditionL = labels + 1;
        int endL = labels + 2;

        cg.label( "label"+conditionL );
        whileStmt.condition.accept( vv, null );
        cg.jz("label"+endL);
        for (var stmt : whileStmt.body) {
            stmt.accept(this, param);
            if (stmt instanceof Return)
                return null;
        }

        if (whileStmt.bytesLocalsSum != 0)
            cg.enter(-whileStmt.bytesLocalsSum);
        cg.jump( "label"+conditionL );

        cg.label( "label"+endL );
        return null;
    }

    @Override
    public Void visit(For forStmt, FuncDefinition param) {
        cg.debugLine(forStmt.getLine());
        int labels = cg.getLabels(2);
        int conditionL = labels + 1;
        int endL = labels + 2;
        forStmt.initialization.accept( this, param );
        cg.label( "label"+conditionL );
        forStmt.condition.accept( vv, null );
        cg.jz("label"+endL);
        for (var stmt : forStmt.body) {
            stmt.accept(this, param);
            if (stmt instanceof Return)
                return null;
        }

        if (forStmt.bytesLocalsSum != 0)
            cg.enter(-forStmt.bytesLocalsSum);
        forStmt.increment.accept( this, param );

        cg.jump( "label"+conditionL );

        cg.label( "label"+endL );
        return null;
    }

    @Override
    public Void visit(Function stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        stmt.accept( vv, null );
        if (!(stmt.getType() instanceof VoidType))
            cg.pop(stmt.getType().getSuffix());

        return null;
    }

    @Override
    public Void visit(Return stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        if (stmt.returnValue != null) {
            stmt.returnValue.accept(vv, null);
            cg.ret(stmt.returnValue.getType().numberOfBytes(), param.bytesLocalsSum, ((FunctionType) param.type).bytesParamsSum);
        } else {
            cg.ret(0, stmt.currentReservedBytes, ((FunctionType) param.type).bytesParamsSum);
        }

        return null;
    }

}
