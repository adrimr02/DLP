package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;
import java.util.Objects;

public class RecordType extends AbstractType {

  public List<RecordField> fields;

  public RecordType(List<RecordField> fields) {
    this.fields = fields;
  }

  @Override
  public Type dot(String id, ASTNode astNode) {
    for (var field : fields)
      if (field.name.equals( id ))
        return field.type;

    return new ErrorType( "Could not find field '"+id+"'", astNode.getLine(), astNode.getColumn() );
  }

  @Override
  public int numberOfBytes() {
    int total = 0;
    for (var f : fields)
      total += f.type.numberOfBytes();

    return total;
  }

  public RecordField getField(String name) {
    return fields.stream().filter( f -> f.name.equals( name ) ).findFirst().orElse( null );
  }

  @Override
  public boolean isReferenced() {
    return true;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder("Record {");
    for (var field : fields) {
      str.append(field.name).append(":").append(field).append(",");
    }
    if (!fields.isEmpty())
      str.delete(str.length()-1, str.length());

    str.append("}");
    return str.toString();
  }

  @Override
  public String getCode() {
    StringBuilder str = new StringBuilder("{");
    for (var field : fields) {
      str.append("\n\t").append(field.name).append(":").append(field.type.getCode());
    }
    if (!fields.isEmpty())
      str.append("\n");
    str.append("}");
    return str.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RecordType that = (RecordType) o;
    return Objects.equals(fields, that.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }
}
