package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.visitor.Visitor;

public class BoolType extends AbstractType {

  private static BoolType intType;

  public static BoolType getInstance() {
    if (intType == null)
      intType = new BoolType();

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
  public Type ternary(Type type, ASTNode astNode) {
    if (type instanceof BoolType || type instanceof ErrorType)
      return type;
    else
      return new ErrorType( "Ternary operator cannot be applied to 'Boolean' and '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type logic(Type type, ASTNode astNode) {
    if (type instanceof BoolType || type instanceof ErrorType)
      return type;
    else
      return new ErrorType( "Logical operator cannot be applied to 'Boolean' and '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type logic(ASTNode astNode) {
    return this;
  }

  @Override
  public Type canBeCastTo(Type type, ASTNode astNode) {
    if (type instanceof IntType || type instanceof DoubleType || type instanceof CharType || type instanceof BoolType)
      return type;
    else
      return new ErrorType( "Cannot cast 'Boolean' to '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type promotesTo(Type type, ASTNode astNode) {
    if (type instanceof BoolType || type instanceof ErrorType)
        return type;

    return new ErrorType(this + " is not assignable to " + type, astNode.getLine(), astNode.getColumn());
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
    return "Boolean";
  }

  @Override
  public char getSuffix() {
    return 'i';
  }

}
