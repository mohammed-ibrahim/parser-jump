// Generated from ./src/main/antlr/Jump.g4 by ANTLR 4.5.1
package org.jump.parser.grammer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JumpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JumpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code FieldConfigList}
	 * labeled alternative in {@link JumpParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldConfigList(JumpParser.FieldConfigListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldConfig}
	 * labeled alternative in {@link JumpParser#field_config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldConfig(JumpParser.FieldConfigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link JumpParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(JumpParser.ParamListContext ctx);
}