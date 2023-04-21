package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.Assignment;
import es.uniovi.dlp.ast.types.FunctionType;
import es.uniovi.dlp.util.CodeGenerator;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

    private AddressCGVisitor av;
    private ValueCGVisitor vv;

    public ExecuteCGVisitor(CodeGenerator cg) {
        super(cg);
        av = new AddressCGVisitor( cg );
        vv = new ValueCGVisitor( cg );
    }

    public Void visit(Program program, Void param) {

        cg.call( "main" );
        cg.halt();

        cg.comment( "* Global variables" );
        for (var def : program.definitions)
            if (def instanceof VarDefinition)
                def.accept( this, param );

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
        cg.label( fdef.name );
        cg.comment( "* Parameters");
        fdef.type.accept( this, param );
        cg.comment( "* Local Variables" );

        for (var def : fdef.defs)
            def.accept( this, param );

        if (fdef.defs.size() > 0)
            cg.enter( fdef.defs.get( fdef.defs.size() -1 ).offset );

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

}
