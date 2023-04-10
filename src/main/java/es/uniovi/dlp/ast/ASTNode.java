package es.uniovi.dlp.ast;

import es.uniovi.dlp.visitor.Visitor;

public interface ASTNode {
  
  int getLine();
  int getColumn();

  <PT, RT> RT accept(Visitor<PT, RT> v, PT param);

}
