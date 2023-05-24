package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.ArrayAccess;
import es.uniovi.dlp.ast.expressions.FieldAccess;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.ArrayType;
import es.uniovi.dlp.ast.types.RecordType;
import es.uniovi.dlp.util.CodeGenerator;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    private final ValueCGVisitor vv;

    public AddressCGVisitor(CodeGenerator cg) {
        super(cg);
        vv = new ValueCGVisitor( cg, this );
    }

    @Override
    public Void visit(Variable exp, Void param) {

        if (exp.definition.getScope()==0)
            cg.pusha(((VarDefinition) exp.definition).offset);
        else {
            cg.pushBp();
            cg.pushi(((VarDefinition) exp.definition).offset);
            cg.add('i');
        }

        return null;
    }

    @Override
    public Void visit(ArrayAccess exp, Void param) {
        exp.variable.accept( this, param );
        exp.index.accept( vv, param );
        cg.pushi( exp.getType().numberOfBytes() );
        cg.mul( 'i' );
        cg.add( 'i' );
        return null;
    }

    @Override
    public Void visit(FieldAccess exp, Void param) {
        exp.field.accept( this, param );
        cg.pushi( ((RecordType) exp.field.getType()).getField( exp.name ).offset );
        cg.add( 'i' );
        return null;
    }
}
