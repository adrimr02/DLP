package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.Visitor;

public class Variable extends AbstractASTNode implements Expression {
  
  public String name;
  public boolean isLValue;
  public Definition definition;
  private Type type;

  public Variable(String name, int line, int column) {
    super(line, column);
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

  public Definition getDefinition() {
    return definition;
  }

  public void setDefinition(Definition definition) {
    this.definition = definition;
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
