package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

public class RecordField extends AbstractASTNode {
  
  public Type type;
  public String name;

  public RecordField(String name, Type type, int line, int column) {
    super( line, column );
    this.type = type;
    this.name = name;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

  @Override
  public String toString() {
    return type.toString();
  }

}
