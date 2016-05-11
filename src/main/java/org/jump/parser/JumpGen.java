package org.jump.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.BailErrorStrategy;
import java.util.*;

import org.jump.parser.grammer.*;

import java.io.StringWriter;
import java.io.PrintWriter;

public class JumpGen {
    public static void main(String[] args) {
        String str = "sql: \"select * from a\",\n \"select * from b\";\n insert(table1, 4a00): id = fake(name);";

        if (args.length > 0) {
            str = args[0];
        }

        ANTLRInputStream input = new ANTLRInputStream(str);
        JumpLexer lexer = new JumpLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JumpParser parser = new JumpParser(tokens);
        parser.setErrorHandler(new BailErrorStrategy());

        ParseTree tree = parser.statement();
        Analyzer builder = new Analyzer();
        ArrayList<Object> res = (ArrayList<Object>)builder.visit(tree);
        System.out.println("Finally obtained string is: " + res.toString());
    }

    public static ArrayList<Object> parse(String queryString) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(queryString);
            JumpLexer lexer = new JumpLexer(input);
    
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JumpParser parser = new JumpParser(tokens);
            parser.setErrorHandler(new BailErrorStrategy());

            ParseTree tree = parser.statement();
            Analyzer builder = new Analyzer();
            ArrayList<Object> res = (ArrayList<Object>)builder.visit(tree);
    
            return res;
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            System.out.println(sw.toString());
            return null;
        }
    }
}
