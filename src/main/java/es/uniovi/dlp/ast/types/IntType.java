package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

public class IntType extends AbstractType {

  private static IntType intType;

  public static IntType get() {
    if (intType == null)
      intType = new IntType();

    return intType;
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
  public Type arithmetic(Type type, ASTNode astNode) {
    if (type instanceof IntType || type instanceof ErrorType)
      return type;
    else
      return new ErrorType( "Incompatible types. Required 'Integer' type, found '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type arithmetic(ASTNode astNode) {
    return this;
  }

  @Override
  public Type comparison(Type type, ASTNode astNode) {
    if (type instanceof IntType || type instanceof ErrorType)
      return type;
    else
      return new ErrorType( "Comparison operator cannot be applied to 'Integer' and '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type logic(Type type, ASTNode astNode) {
    if (type instanceof IntType || type instanceof ErrorType)
      return type;
    else
      return new ErrorType( "Logical operator cannot be applied to 'Integer' and '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type logic(ASTNode astNode) {
    return this;
  }

  @Override
  public Type canBeCastTo(Type type, ASTNode astNode) {
    if (type instanceof IntType || type instanceof DoubleType || type instanceof CharType)
      return type;
    else
      return new ErrorType( "Cannot cast 'Integer' to '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public int numberOfBytes() {
    return 2;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

  @Override
  public String toString() {
    return "Integer";
  }

}
