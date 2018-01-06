// Generated from C:/Users/Francis Du/IdeaProjects/Compile-miniJava/Compile_MiniJava/src/main/java/com/compile\miniJava.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by the {@code BraceStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceStatement(miniJavaParser.BraceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(miniJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(miniJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(miniJavaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(miniJavaParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignArrayStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArrayStatement(miniJavaParser.AssignArrayStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(miniJavaParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(miniJavaParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(miniJavaParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewClassInstanceExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewClassInstanceExpr(miniJavaParser.NewClassInstanceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthExpr(miniJavaParser.LengthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusMinusExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpr(miniJavaParser.PlusMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewIntArrayExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewIntArrayExpr(miniJavaParser.NewIntArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpr(miniJavaParser.IndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(miniJavaParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessExpr(miniJavaParser.LessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExpr(miniJavaParser.ClassExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(miniJavaParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(miniJavaParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(miniJavaParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesExpr(miniJavaParser.TimesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(miniJavaParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(miniJavaParser.IdentifierContext ctx);
}