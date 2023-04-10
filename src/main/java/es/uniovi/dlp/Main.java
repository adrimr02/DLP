package es.uniovi.dlp;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.ErrorHandler;
import es.uniovi.dlp.parser.PmmLexer;
import es.uniovi.dlp.parser.PmmParser;
import es.uniovi.dlp.visitor.IdentificationVisitor;
import es.uniovi.dlp.visitor.TypeCheckingVisitor;
import introspector.view.IntrospectorView;
import org.antlr.v4.runtime.*;
import introspector.model.IntrospectorModel;


public class Main {
	
	public static void main(String... args) throws Exception {
	   if (args.length<1) {
			System.err.println("Please, pass me the input file.");
			return;
		}
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		PmmParser parser = new PmmParser(tokens);
		ASTNode ast = parser.program().ast;

		ast.accept(new IdentificationVisitor(), null);
		ast.accept(new TypeCheckingVisitor(),null);

		// * Check errors
		if(ErrorHandler.getInstance().anyError()){
			// * Show errors
			ErrorHandler.getInstance().showErrors(System.err);
		}
		else{
			// * The AST is shown
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorView("Introspector", model);
		}
	}
}