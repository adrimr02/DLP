package es.uniovi.dlp;


import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.ErrorHandler;
import es.uniovi.dlp.parser.PmmLexer;
import es.uniovi.dlp.parser.PmmParser;
import es.uniovi.dlp.util.CodeGenerator;
import es.uniovi.dlp.visitor.ExecuteCGVisitor;
import es.uniovi.dlp.visitor.IdentificationVisitor;
import es.uniovi.dlp.visitor.OffSetVisitor;
import es.uniovi.dlp.visitor.TypeCheckingVisitor;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;
import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String... args) throws Exception {
		if (args.length<2) {
			System.err.println("Please, pass me the input and output files.");
			return;
		}

		System.out.println("Compiling " + args[0] + " into " + args[1] + "...");

		List<Exception> errors = new ArrayList<>();

		// create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PmmParser parser = new PmmParser(tokens);
		parser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
				errors.add(e);
				super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
			}
		});
		ASTNode ast = parser.program().ast;

		ast.accept(new IdentificationVisitor(), null);
		ast.accept(new TypeCheckingVisitor(),null);

		// * Check errors
		if(ErrorHandler.getInstance().anyError() || !errors.isEmpty()){
			// * Show errors
			System.out.println("Could not compile due to the following errors:");
			ErrorHandler.getInstance().showErrors(System.err);
		}
		else{
			// * The AST is shown
			ast.accept(new OffSetVisitor(),null);
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorView("Introspector", model);
			CodeGenerator cg = new CodeGenerator(args[0], args[1]);
			ast.accept(new ExecuteCGVisitor(cg), null);
			cg.close();
			System.out.println("Success!");
		}
	}
}
