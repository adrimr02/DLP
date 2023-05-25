package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

import java.util.Objects;

public class RecordField extends AbstractASTNode {
  
  public Type type;
  public String name;
  public int offset;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RecordField that = (RecordField) o;
    return Objects.equals(type, that.type) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name);
  }
}
