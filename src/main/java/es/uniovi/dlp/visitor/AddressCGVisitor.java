package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.util.CodeGenerator;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    public AddressCGVisitor(CodeGenerator cg) {
        super(cg);
    }

    @Override
    public Void visit(Variable exp, Void param) {

        if (exp.definition.getScope()==0)
            cg.pusha(((VarDefinition) exp.definition).offset);
        else {
            cg.pushBp();
            cg.pushi(((VarDefinition) exp.definition).offset);
            cg.add('i');
        }

        return null;
    }
}
