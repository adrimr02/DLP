package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;

import java.util.List;

public interface Type extends ASTNode {

    Type asBuiltInType(ASTNode astNode);
    Type asLogical(ASTNode astNode);
    Type parenthesis(List<Type> type, ASTNode astNode);
    Type arithmetic(Type type, ASTNode astNode);
    Type arithmetic(ASTNode astNode);
    Type comparison(Type type, ASTNode astNode);
    Type logic(Type type, ASTNode astNode);
    Type logic(ASTNode astNode);
    Type canBeCastTo(Type type, ASTNode astNode);
    Type squareBrackets(Type type, ASTNode astNode);
    Type dot(String id, ASTNode astNode);

    int numberOfBytes();

}
