package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.Type;

public interface Expression extends ASTNode {

    boolean getIsLValue();
    void setIsLValue(boolean isLValue);

    Type getType();
    void setType(Type type);

}
