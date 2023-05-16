package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.CharType;
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

    public Void visit(VarDefinition vdef, FuncDefinition param) {
        cg.comment( "* " + vdef);
        return null;
    }

    public Void visit(FuncDefinition fdef, FuncDefinition param) {
        cg.label( fdef.name );
        cg.comment( "* Parameters");
        fdef.type.accept( this, param );
        cg.comment( "* Local Variables" );

        int lvSize = 0;

        for (var def : fdef.defs) {
            cg.debugLine(def.getLine());
            def.accept( this, fdef );
        }

        if (fdef.defs.size() > 0) {
            cg.enter( -fdef.defs.get( fdef.defs.size() -1 ).offset );
            lvSize = -fdef.defs.get( fdef.defs.size() -1 ).offset;
        }

        for (var stmt :  fdef.statements) {
            stmt.accept(this, fdef);
        }

        if (((FunctionType) fdef.type).returnType instanceof VoidType)
            cg.ret(0, lvSize, ((FunctionType) fdef.type).bytesParamsSum);

        return null;
    }

    public Void visit(FunctionType type, FuncDefinition param) {

        for (var arg : type.arguments)
            arg.accept( this, param );

        return null;
    }

    public Void visit(Assignment stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        stmt.left.accept( this.av, null );
        stmt.right.accept( this.vv, null );

        cg.store(stmt.left.getType().getSuffix());

        return null;
    }

    public Void visit(AssignmentOperator stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        stmt.target.accept( this.av, null );
        stmt.target.accept( this.vv, null );

        cg.pushi(1);

        if (!(stmt.target.getType() instanceof IntType))
            cg.convert( IntType.get(), stmt.target.getType() );

        switch (stmt.operator) {
            case "++" -> cg.add(stmt.target.getType().getSuffix());
            case "--" -> cg.sub(stmt.target.getType().getSuffix());
        }

        cg.store(stmt.target.getType().getSuffix());

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
        for (var stmt : ifElse.ifBody)
            stmt.accept( this, param );

        cg.jump( "label"+endL );
        cg.label( "label"+elseL );
        for (var stmt : ifElse.elseBody)
            stmt.accept( this, param );

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
        for (var stmt : whileStmt.body)
            stmt.accept( this, param );

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
        for (var stmt : forStmt.body)
            stmt.accept( this, param );

        forStmt.increment.accept( this, param );

        cg.jump( "label"+conditionL );

        cg.label( "label"+endL );
        return null;
    }

    @Override
    public Void visit(Function stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        stmt.accept( vv, null );
        if (!(stmt.type instanceof VoidType))
            cg.pop(stmt.type.getSuffix());

        return null;
    }

    @Override
    public Void visit(Return stmt, FuncDefinition param) {
        cg.debugLine(stmt.getLine());
        stmt.returnValue.accept(vv, null);
        cg.ret( stmt.returnValue.getType().numberOfBytes(), param.bytesLocalsSum, ((FunctionType)param.type).bytesParamsSum);
        return null;
    }
}
