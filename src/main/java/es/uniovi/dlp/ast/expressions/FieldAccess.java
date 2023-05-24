package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.Visitor;

public class FieldAccess extends AbstractASTNode implements Expression {
  
  public Expression field;
  public String name;

  public boolean isLValue;
  private Type type;

  public FieldAccess(Expression field, String name, int line, int column) {
    super( line, column );
    this.field = field;
    this.name = name;
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
