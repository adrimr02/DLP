package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

import java.util.Objects;

public class ArrayType extends AbstractType {

  public Type type;
  public int size;

  public ArrayType(Type type, int size) {
    this.type = type;
    this.size = size;
  }

  @Override
  public Type squareBrackets(Type type, ASTNode astNode) {
    if (type instanceof IntType || type instanceof ErrorType)
      return this.type;
    else
      return new ErrorType( "Array index must be of type integer", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public boolean isReferenced() {
    return true;
  }

  @Override
  public int numberOfBytes() {
    return type.numberOfBytes() * size;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

  @Override
  public String toString() {
    return type + "[" + size + "]";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArrayType arrayType = (ArrayType) o;
    return size == arrayType.size && Objects.equals( type, arrayType.type );
  }

  @Override
  public String getCode() {
    return size + "* " + type.getCode();
  }

}
