package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType() {
        this( 0, 0 );
    }

    public AbstractType(int line, int column) {
        super( line, column );
    }

    public Type get() {
        return this;
    }

    public Type asLogical(ASTNode astNode) {
        return new ErrorType( this + " is not a logical type", astNode.getLine(), astNode.getColumn() );
    }

    @Override
    public Type asBuiltInType(ASTNode astNode) {
        return new ErrorType(this + " is not a built in type", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type parenthesis(List<Type> types, ASTNode astNode) {
        for (var type : types)
            if (type instanceof ErrorType)
                return type;

        return new ErrorType(this + " is not a function", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type ternary(Type type, ASTNode astNode) {
        if (type instanceof ErrorType)
            return type;

        return new ErrorType(this + " cannot be the result of ternary operators", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type arithmetic(Type type, ASTNode astNode) {
        if (type instanceof ErrorType)
            return type;

        return new ErrorType(this + " does not support arithmetic operations", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type arithmetic(ASTNode astNode) {
        return new ErrorType(this + " does not support comparisons", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type comparison(Type type, ASTNode astNode) {
        if (type instanceof ErrorType)
            return type;

        return new ErrorType(this + " does not support comparisons", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type logic(Type type, ASTNode astNode) {
        if (type instanceof ErrorType)
            return type;

        return new ErrorType(this + " does not support logic operations", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type logic(ASTNode astNode) {
        return new ErrorType(this + " does not support logic operations", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode astNode) {
        if (type instanceof ErrorType)
            return type;

        return new ErrorType(this + " does not support casting", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type squareBrackets(Type type, ASTNode astNode) {
        if (type instanceof ErrorType)
            return type;

        return new ErrorType(this + " does not support array access", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type dot(String id, ASTNode astNode) {
        return new ErrorType(this + " does not support field access", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public char getSuffix() {
        throw new IllegalStateException("Suffix is only available for built-in types");
    }

    @Override
    public Type promotesTo(Type type, ASTNode astNode) {
        if (type instanceof ErrorType)
            return type;

        return new ErrorType(this + " is not assignable to " + type, astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type asNumerical(ASTNode astNode) {
        return new ErrorType(this + " is not a numerical type", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public Type asNumerical(Type type, ASTNode astNode) {
        if (type instanceof ErrorType)
            return type;

        return new ErrorType(this + " is not a numerical type", astNode.getLine(), astNode.getColumn());
    }

    @Override
    public boolean isReferenced() {
        return false;
    }
}
