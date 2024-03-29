package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.Visitor;

public class VarDefinition extends AbstractDefinition {

  public int offset;

  public VarDefinition(String name, Type type, int line, int column) {
    super( type, name, line, column );
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

  public String toString() {
    return type + " " + name + " (offset: " + offset + ")";
  }

}
