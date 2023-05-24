// Generated from C:/Users/adria/IdeaProjects/DLP/src/main/java/es/uniovi/dlp/parser\Pmm.g4 by ANTLR 4.12.0
package es.uniovi.dlp.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PmmParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#var_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_definition(PmmParser.Var_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#func_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_definition(PmmParser.Func_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#typedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(PmmParser.TypedefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpStmt(PmmParser.ExpStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(PmmParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(PmmParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
}