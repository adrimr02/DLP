package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.Visitor;

public class TypeDefinition extends AbstractDefinition {

    public TypeDefinition(Type type, String name, int line, int column) {
        super(type, name, line, column);
    }

    @Override
    public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Type definition '" + name + "' of type '" + type + "'";
    }
}
