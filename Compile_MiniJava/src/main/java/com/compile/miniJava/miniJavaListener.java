// Generated from C:/Users/Francis Du/IdeaProjects/Compile-miniJava/Compile_MiniJava/src/main/java/com/compile\miniJava.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by the {@code BraceStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBraceStatement(miniJavaParser.BraceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BraceStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBraceStatement(miniJavaParser.BraceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(miniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(miniJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(miniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(miniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(miniJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(miniJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(miniJavaParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(miniJavaParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignArrayStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignArrayStatement(miniJavaParser.AssignArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignArrayStatement}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignArrayStatement(miniJavaParser.AssignArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(miniJavaParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(miniJavaParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(miniJavaParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(miniJavaParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(miniJavaParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(miniJavaParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewClassInstanceExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewClassInstanceExpr(miniJavaParser.NewClassInstanceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewClassInstanceExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewClassInstanceExpr(miniJavaParser.NewClassInstanceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LengthExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLengthExpr(miniJavaParser.LengthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LengthExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLengthExpr(miniJavaParser.LengthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusMinusExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(miniJavaParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusMinusExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(miniJavaParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewIntArrayExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewIntArrayExpr(miniJavaParser.NewIntArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewIntArrayExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewIntArrayExpr(miniJavaParser.NewIntArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(miniJavaParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(miniJavaParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(miniJavaParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(miniJavaParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessExpr(miniJavaParser.LessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessExpr(miniJavaParser.LessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpr(miniJavaParser.ClassExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpr(miniJavaParser.ClassExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(miniJavaParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(miniJavaParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(miniJavaParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(miniJavaParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(miniJavaParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(miniJavaParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTimesExpr(miniJavaParser.TimesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTimesExpr(miniJavaParser.TimesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(miniJavaParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(miniJavaParser.ThisExprContext ctx);
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