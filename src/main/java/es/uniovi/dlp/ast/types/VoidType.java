package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

public class VoidType extends AbstractType {

    private static VoidType voidType;

    public static VoidType get() {
        if (voidType == null) {
            voidType = new VoidType();
        }

        return voidType;
    }

    @Override
    public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
        return v.visit( this, param );
    }

    @Override
    public String toString() {
        return "Void";
    }
}
