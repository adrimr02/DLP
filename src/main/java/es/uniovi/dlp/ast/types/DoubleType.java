package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

public class DoubleType extends AbstractType {

  private static DoubleType doubleType;

  public static DoubleType get() {
    if (doubleType == null)
      doubleType = new DoubleType();

    return doubleType;
  }

  @Override
  public Type asBuiltInType(ASTNode astNode) {
    return this;
  }

  @Override
  public Type arithmetic(Type type, ASTNode astNode) {
    if (type instanceof DoubleType || type instanceof ErrorType)
      return type;
    else
      return new ErrorType( "Incompatible types. Required 'Double' type, found '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type arithmetic(ASTNode astNode) {
    return this;
  }

  @Override
  public Type comparison(Type type, ASTNode astNode) {
    if (type instanceof DoubleType)
      return IntType.get();
    else if (type instanceof ErrorType)
      return type;
    else
      return new ErrorType( "Comparison operator cannot be applied to 'Double' and '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type canBeCastTo(Type type, ASTNode astNode) {
    if (type instanceof IntType || type instanceof DoubleType || type instanceof CharType)
      return type;
    else
      return new ErrorType( "Cannot cast 'Double' to '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

  @Override
  public String toString() {
    return "Double";
  }

}
