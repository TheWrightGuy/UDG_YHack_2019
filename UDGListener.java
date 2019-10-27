// Generated from UDG.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UDGParser}.
 */
public interface UDGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UDGParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(UDGParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(UDGParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link UDGParser#comment_list}.
	 * @param ctx the parse tree
	 */
	void enterComment_list(UDGParser.Comment_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#comment_list}.
	 * @param ctx the parse tree
	 */
	void exitComment_list(UDGParser.Comment_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link UDGParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(UDGParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(UDGParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UDGParser#comm_type}.
	 * @param ctx the parse tree
	 */
	void enterComm_type(UDGParser.Comm_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#comm_type}.
	 * @param ctx the parse tree
	 */
	void exitComm_type(UDGParser.Comm_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UDGParser#tags_list}.
	 * @param ctx the parse tree
	 */
	void enterTags_list(UDGParser.Tags_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#tags_list}.
	 * @param ctx the parse tree
	 */
	void exitTags_list(UDGParser.Tags_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link UDGParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(UDGParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(UDGParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link UDGParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(UDGParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(UDGParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link UDGParser#tag_prefix}.
	 * @param ctx the parse tree
	 */
	void enterTag_prefix(UDGParser.Tag_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#tag_prefix}.
	 * @param ctx the parse tree
	 */
	void exitTag_prefix(UDGParser.Tag_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link UDGParser#junk_lines}.
	 * @param ctx the parse tree
	 */
	void enterJunk_lines(UDGParser.Junk_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#junk_lines}.
	 * @param ctx the parse tree
	 */
	void exitJunk_lines(UDGParser.Junk_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UDGParser#junk_list}.
	 * @param ctx the parse tree
	 */
	void enterJunk_list(UDGParser.Junk_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#junk_list}.
	 * @param ctx the parse tree
	 */
	void exitJunk_list(UDGParser.Junk_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link UDGParser#injunk_list}.
	 * @param ctx the parse tree
	 */
	void enterInjunk_list(UDGParser.Injunk_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link UDGParser#injunk_list}.
	 * @param ctx the parse tree
	 */
	void exitInjunk_list(UDGParser.Injunk_listContext ctx);
}