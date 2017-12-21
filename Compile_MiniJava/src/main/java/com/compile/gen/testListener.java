// Generated from D:/lsc/Compile_MiniJava/src/main/java/com/compile\test.g4 by ANTLR 4.7
package com.compile.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(testParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(testParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(testParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(testParser.ValueContext ctx);
}