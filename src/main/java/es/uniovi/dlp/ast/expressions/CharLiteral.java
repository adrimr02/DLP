package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.Visitor;

public class CharLiteral extends AbstractASTNode implements Expression {
  
  public char value;
  public boolean isLValue;
  private Type type;

  public CharLiteral(char value, int line, int column) {
    super(line, column);
    this.value = value;
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
