package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

public class CharType extends AbstractType {

  private static CharType charType;

  public static CharType get() {
    if (charType == null)
      charType = new CharType();

    return charType;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

  @Override
  public Type asBuiltInType(ASTNode astNode) {
    return this;
  }

  @Override
  public Type arithmetic(Type type, ASTNode astNode) {
    if (type instanceof CharType)
      return IntType.get();
    else if (type instanceof ErrorType)
      return type;
    else
      return new ErrorType( "Arithmetic operator cannot be applied to 'Char' and '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type comparison(Type type, ASTNode astNode) {
    if (type instanceof CharType || type instanceof ErrorType)
      return type;
    else
      return new ErrorType( "Comparison operator cannot be applied to 'Char' and '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type canBeCastTo(Type type, ASTNode astNode) {
    if (type instanceof IntType || type instanceof DoubleType || type instanceof CharType)
      return type;
    else
      return new ErrorType( "Cannot cast 'Char' to '" + type + "'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public Type promotesTo(Type type, ASTNode astNode) {
    if (type instanceof CharType || type instanceof ErrorType)
      return type;

    return new ErrorType(this + " is not assignable to " + type, astNode.getLine(), astNode.getColumn());
  }

  @Override
  public int numberOfBytes() {
    return 1;
  }

  @Override
  public String toString() {
    return "Character";
  }

  @Override
  public char getSuffix() {
    return 'b';
  }
}
