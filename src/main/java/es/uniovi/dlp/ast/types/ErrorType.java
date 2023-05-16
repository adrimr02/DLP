package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.ErrorHandler;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class ErrorType extends AbstractType {

    private String message;

    public ErrorType(String message, int line, int column) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError( this );
    }

    public String getMessage() {
        return message;
    }

    @Override
    public Type asLogical(ASTNode astNode) {
        return this;
    }

    @Override
    public Type asBuiltInType(ASTNode astNode) {
        return this;
    }

    @Override
    public Type parenthesis(List<Type> types, ASTNode astNode) {
        return this;
    }

    @Override
    public Type ternary(Type type, ASTNode astNode) {
        return this;
    }

    @Override
    public Type arithmetic(Type type, ASTNode astNode) {
        return this;
    }

    @Override
    public Type arithmetic(ASTNode astNode) {
        return this;
    }

    @Override
    public Type comparison(Type type, ASTNode astNode) {
        return this;
    }

    @Override
    public Type logic(Type type, ASTNode astNode) {
        return this;
    }

    @Override
    public Type logic(ASTNode astNode) {
        return this;
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode astNode) {
        return this;
    }

    @Override
    public Type squareBrackets(Type type, ASTNode astNode) {
        return this;
    }

    @Override
    public Type dot(String id, ASTNode astNode) {
        return this;
    }

    @Override
    public Type promotesTo(Type type, ASTNode astNode) {
        return this;
    }

    @Override
    public Type asNumerical(ASTNode astNode) {
        return this;
    }

    @Override
    public Type asNumerical(Type type, ASTNode astNode) {
        return this;
    }

    @Override
    public String toString() {
        return "Error: " + message + " at line " + getLine() + ":" + getColumn();
    }

    @Override
    public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
        return v.visit( this, param );
    }

}
