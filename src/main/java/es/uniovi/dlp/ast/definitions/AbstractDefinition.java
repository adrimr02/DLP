package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

  public Type type;
  public String name;

  public int scope;

  public AbstractDefinition(Type type, String name, int line, int column) {
    super( line, column );
    this.type = type;
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Type getType() {
    return type;
  }

  @Override
  public int getScope() {
    return scope;
  }

  @Override
  public void setScope(int scope) {
    this.scope = scope;
  }
}
