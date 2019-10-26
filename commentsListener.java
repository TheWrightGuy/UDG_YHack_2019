// Generated from comments.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link commentsParser}.
 */
public interface commentsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link commentsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(commentsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link commentsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(commentsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link commentsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(commentsParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link commentsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(commentsParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link commentsParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(commentsParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link commentsParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(commentsParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link commentsParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(commentsParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link commentsParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(commentsParser.AuthorContext ctx);
}