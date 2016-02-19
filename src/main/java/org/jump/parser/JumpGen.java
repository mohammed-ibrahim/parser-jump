package org.jump.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import java.util.*;

import org.jump.parser.grammer.*;

import java.io.StringWriter;
import java.io.PrintWriter;

public class JumpGen {
    public static void main(String[] args) {
        String str = "field_id = sql_com(\"select * from table1 adn ,''  then !#$!, \", 2)";

        if (args.length > 0) {
            str = args[0];
        }

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
        try {
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
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            System.out.println(sw.toString());
            return null;
        }
    }
}
