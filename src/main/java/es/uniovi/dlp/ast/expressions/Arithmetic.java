package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.Visitor;

public class Arithmetic extends AbstractASTNode implements Expression {

  public String operator;
  public Expression left;
  public Expression right;

  public boolean isLValue;
  private Type type;

  public Arithmetic(Expression left, String operator, Expression right, int line, int column) {
    super( line, column );
    this.operator = operator;
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean getIsLValue() {
    return isLValue;
  }

  @Override
  public void setIsLValue(boolean isLValue) {
    this.isLValue = isLValue;
  }

  @Override
  public Type getType() {
    return type.get();
  }

  @Override
  public void setType(Type type) {
    this.type = type;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

}
