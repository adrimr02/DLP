package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.definitions.TypeDefinition;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;
import java.util.Objects;

public class CustomType extends AbstractType {

    public TypeDefinition def;
    public Type type;
    public String name;

    public CustomType(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public TypeDefinition getDefinition() {
        return def;
    }

    public void setDefinition(TypeDefinition def) {
        this.def = def;
    }

    @Override
    public Type get() {
        return type;
    }

    @Override
    public Type asLogical(ASTNode astNode) {
        typeIsDefined();
        return type.asLogical(astNode);
    }

    @Override
    public Type asBuiltInType(ASTNode astNode) {
        typeIsDefined();
        return type.asBuiltInType(astNode);
    }

    @Override
    public Type ternary(Type type, ASTNode astNode) {
        typeIsDefined();
        return type.ternary(type, astNode);
    }

    @Override
    public Type arithmetic(Type type, ASTNode astNode) {
        typeIsDefined();
        return type.arithmetic(type, astNode);
    }

    @Override
    public Type arithmetic(ASTNode astNode) {
        typeIsDefined();
        return type.arithmetic(astNode);
    }

    @Override
    public Type comparison(Type type, ASTNode astNode) {
        typeIsDefined();
        return type.comparison(type, astNode);
    }

    @Override
    public Type logic(Type type, ASTNode astNode) {
        typeIsDefined();
        return type.logic(type, astNode);
    }

    @Override
    public Type logic(ASTNode astNode) {
        typeIsDefined();
        return type.logic(astNode);
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode astNode) {
        typeIsDefined();
        return type.canBeCastTo(type, astNode);
    }

    @Override
    public Type squareBrackets(Type type, ASTNode astNode) {
        typeIsDefined();
        return type.squareBrackets(type, astNode);
    }

    @Override
    public Type dot(String id, ASTNode astNode) {
        typeIsDefined();
        return type.dot(id, astNode);
    }

    @Override
    public int numberOfBytes() {
        typeIsDefined();
        return type.numberOfBytes();
    }

    @Override
    public char getSuffix() {
        typeIsDefined();
        return type.getSuffix();
    }

    @Override
    public Type promotesTo(Type type, ASTNode astNode) {
        typeIsDefined();
        return type.promotesTo(type, astNode);
    }

    @Override
    public Type asNumerical(ASTNode astNode) {
        typeIsDefined();
        return type.asNumerical(astNode);
    }

    @Override
    public Type asNumerical(Type type, ASTNode astNode) {
        typeIsDefined();
        return type.asNumerical(type, astNode);
    }

    @Override
    public boolean isReferenced() {
        return type.isReferenced();
    }

    @Override
    public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (Objects.equals(type, o)) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomType that = (CustomType) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    private void typeIsDefined() {
        if (this.def == null || this.type == null)
            throw new IllegalStateException("Must be associated with a type and its definition");
    }

    @Override
    public String toString() {
        return type.toString();
    }

    @Override
    public String getCode() {
        return name;
    }
}
