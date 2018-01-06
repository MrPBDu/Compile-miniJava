// Generated from C:/Users/Lenovo/IdeaProjects/Compile-miniJava/Compile_MiniJava/src/main/java/com/compile\miniJava.g4 by ANTLR 4.7
package com.compile.miniJava;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(miniJavaParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#mainclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainclass(miniJavaParser.MainclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#classdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdeclaration(miniJavaParser.ClassdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#vardeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclaration(miniJavaParser.VardeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddeclaration(miniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(miniJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(miniJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(miniJavaParser.IdentifierContext ctx);
}