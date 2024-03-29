package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

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
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

  @Override
  public String toString() {
    return "Record";
  }

}
