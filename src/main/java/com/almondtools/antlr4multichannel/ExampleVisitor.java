// Generated from grammar/Example.g4 by ANTLR 4.7.2
package com.almondtools.antlr4multichannel;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExampleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExampleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExampleParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(ExampleParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleParser#templateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBody(ExampleParser.TemplateBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeChunk}
	 * labeled alternative in {@link ExampleParser#templateChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeChunk(ExampleParser.CodeChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textChunk}
	 * labeled alternative in {@link ExampleParser#templateChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextChunk(ExampleParser.TextChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(ExampleParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ExampleParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ExampleParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ExampleParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleParser#texttoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexttoken(ExampleParser.TexttokenContext ctx);
}