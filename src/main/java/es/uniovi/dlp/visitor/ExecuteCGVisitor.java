package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.Assignment;
import es.uniovi.dlp.ast.statements.Input;
import es.uniovi.dlp.ast.statements.Print;
import es.uniovi.dlp.ast.types.FunctionType;
import es.uniovi.dlp.ast.types.VoidType;
import es.uniovi.dlp.util.CodeGenerator;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

    private final AddressCGVisitor av;
    private final ValueCGVisitor vv;

    public ExecuteCGVisitor(CodeGenerator cg) {
        super(cg);
        av = new AddressCGVisitor( cg );
        vv = new ValueCGVisitor( cg, av );
    }

    public Void visit(Program program, Void param) {

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

    public Void visit(VarDefinition vdef, Void param) {
        cg.comment( "* " + vdef);
        return null;
    }

    public Void visit(FuncDefinition fdef, Void param) {
        cg.debugLine(fdef.getLine());
        cg.label( fdef.name );
        cg.comment( "* Parameters");
        fdef.type.accept( this, param );
        cg.comment( "* Local Variables" );

        int lvSize = 0;

        for (var def : fdef.defs) {
            cg.debugLine(def.getLine());
            def.accept( this, param );
        }

        if (fdef.defs.size() > 0) {
            cg.enter( -fdef.defs.get( fdef.defs.size() -1 ).offset );
            lvSize = -fdef.defs.get( fdef.defs.size() -1 ).offset;
        }

        for (var stmt :  fdef.statements) {
            cg.debugLine(stmt.getLine());
            stmt.accept(this, param);
        }

        if (((FunctionType) fdef.type).returnType instanceof VoidType)
            cg.ret(0, lvSize, 0);

        return null;
    }

    public Void visit(FunctionType type, Void param) {

        for (var arg : type.arguments)
            arg.accept( this, param );

        return null;
    }

    public Void visit(Assignment stmt, Void param) {

        stmt.left.accept( this.av, param );
        stmt.right.accept( this.vv, param );

        cg.store(stmt.left.getType().getSuffix());

        return null;
    }

    public Void visit(Input stmt, Void param) {

        stmt.expression.accept(this.av, param);
        cg.in(stmt.expression.getType().getSuffix());
        cg.store(stmt.expression.getType().getSuffix());

        return null;
    }

    @Override
    public Void visit(Print stmt, Void param) {

        stmt.expression.accept(this.vv, param);
        cg.out(stmt.expression.getType().getSuffix());

        return null;
    }
}
