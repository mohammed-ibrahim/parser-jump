    // Generated from ./src/main/antlr/Jump.g4 by ANTLR 4.5.1
package org.jump.parser;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import org.jump.parser.grammer.*;
import java.util.*;

public class Analyzer extends JumpBaseVisitor<WrappedResult> {
	@Override public WrappedResult visitFieldConfigList(JumpParser.FieldConfigListContext ctx) { 
        WrappedResult list = new WrappedResult();
        for (int i =0; i< ctx.field_config().size(); i++) {

            WrappedResult inner = (WrappedResult)visit(ctx.field_config(i));
            list.addToFinalList(inner.getList());
        }

        return list;
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public WrappedResult visitFieldConfig(JumpParser.FieldConfigContext ctx) { 
        WrappedResult wr = new WrappedResult();

        //WrappedResult item0 = (WrappedResult)visit(ctx.item(0));
        //WrappedResult item1 = (WrappedResult)visit(ctx.item(1));
        wr.addToList(ctx.WORD(0).getText());
        wr.addToList(ctx.WORD(1).getText());

        //wr.addToList(ctx.STRING(2).getText());
        //WrappedResult fiName = (WrappedResult)visit(ctx.field_name());
        //wr.addToList(fiName.getItem());

        //WrappedResult fnName = (WrappedResult)visit(ctx.function_name());
        //wr.addToList(fnName.getItem());

        WrappedResult paramList = (WrappedResult)visit(ctx.param_list());
        wr.getList().addAll(paramList.getList()); 
        //wr.addToList(paramName.getItem());

        return wr;
    }

	@Override public WrappedResult visitParamList(JumpParser.ParamListContext ctx) { 
        WrappedResult wr = new WrappedResult();
        for (int i=0; i< ctx.item().size(); i++) {
            WrappedResult inner = (WrappedResult)visit(ctx.item(i));
            wr.addToList(inner.getItem());
        }

        return wr;
    }

	@Override public WrappedResult visitParamItem(JumpParser.ParamItemContext ctx) { 
        if (ctx.STRING() != null) {
            String text = ctx.STRING().getText();
            text = text.substring(1, text.length()-1);
            return new WrappedResult(text);
        }

        if (ctx.WORD() != null) {
            return new WrappedResult(ctx.WORD().getText());
        }

        throw new RuntimeException("Given text is neither word not text");
    }
}
