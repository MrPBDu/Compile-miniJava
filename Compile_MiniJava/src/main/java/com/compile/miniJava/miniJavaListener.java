// Generated from D:/lsc/Compile_MiniJava/src/main/java/com/compile\miniJava.g4 by ANTLR 4.7
package com.compile.miniJava;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniJavaParser}.
 */
public interface miniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(miniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(miniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#mainclass}.
	 * @param ctx the parse tree
	 */
	void enterMainclass(miniJavaParser.MainclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#mainclass}.
	 * @param ctx the parse tree
	 */
	void exitMainclass(miniJavaParser.MainclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassdeclaration(miniJavaParser.ClassdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassdeclaration(miniJavaParser.ClassdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaration(miniJavaParser.VardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaration(miniJavaParser.VardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethoddeclaration(miniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethoddeclaration(miniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(miniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(miniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(miniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(miniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(miniJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(miniJavaParser.IdentifierContext ctx);
}