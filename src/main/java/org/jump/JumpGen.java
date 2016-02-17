package org.jump;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

import org.jump.grammer.*;

public class JumpGen {
    public static void main(String[] args) {
        String str = "col1mna = fun4ti'\"a ( pa-ramaa_, paramab, 1, 134 ), columnb = functionb ( paramaa, paramab, paramac, paramad)";
        ANTLRInputStream input = new ANTLRInputStream(str);
        JumpLexer lexer = new JumpLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JumpParser parser = new JumpParser(tokens);
        ParseTree tree = parser.input();

        Analyzer builder = new Analyzer();
        WrappedResult res = (WrappedResult)builder.visit(tree);
        System.out.println("Finally obtained string is: " + res.toString());
    }

    public static ArrayList<FieldConfig> parseFields(String queryString) {
        ANTLRInputStream input = new ANTLRInputStream(queryString);
        JumpLexer lexer = new JumpLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JumpParser parser = new JumpParser(tokens);
        ParseTree tree = parser.input();

        Analyzer builder = new Analyzer();
        WrappedResult res = (WrappedResult)builder.visit(tree);

        ArrayList<FieldConfig> resultSet = new ArrayList<FieldConfig>();


        for (ArrayList<String> list : res.getFinalList()) {

            ArrayList<String> sublist = new ArrayList<String>();
            for (String item: list.subList(2, list.size())) {
                sublist.add(item);
            }

            resultSet.add(new FieldConfig(list.get(0), list.get(1), sublist));
        }

        return resultSet;
    }
}
