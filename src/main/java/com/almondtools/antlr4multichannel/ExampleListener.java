// Generated from grammar/Example.g4 by ANTLR 4.7.2
package com.almondtools.antlr4multichannel;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExampleParser}.
 */
public interface ExampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExampleParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(ExampleParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(ExampleParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBody(ExampleParser.TemplateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBody(ExampleParser.TemplateBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeChunk}
	 * labeled alternative in {@link ExampleParser#templateChunk}.
	 * @param ctx the parse tree
	 */
	void enterCodeChunk(ExampleParser.CodeChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeChunk}
	 * labeled alternative in {@link ExampleParser#templateChunk}.
	 * @param ctx the parse tree
	 */
	void exitCodeChunk(ExampleParser.CodeChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textChunk}
	 * labeled alternative in {@link ExampleParser#templateChunk}.
	 * @param ctx the parse tree
	 */
	void enterTextChunk(ExampleParser.TextChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textChunk}
	 * labeled alternative in {@link ExampleParser#templateChunk}.
	 * @param ctx the parse tree
	 */
	void exitTextChunk(ExampleParser.TextChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(ExampleParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(ExampleParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ExampleParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ExampleParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ExampleParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ExampleParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(ExampleParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(ExampleParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleParser#texttoken}.
	 * @param ctx the parse tree
	 */
	void enterTexttoken(ExampleParser.TexttokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleParser#texttoken}.
	 * @param ctx the parse tree
	 */
	void exitTexttoken(ExampleParser.TexttokenContext ctx);
}