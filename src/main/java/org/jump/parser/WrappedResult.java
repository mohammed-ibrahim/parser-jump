package org.jump.parser;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import org.jump.parser.grammer.*;
import java.util.*;

public class WrappedResult {

    public WrappedResult() { }

    public WrappedResult(String str) {
        this.item = str;
    }

    private String item;

    private ArrayList<String> list = new ArrayList<String>();

    private ArrayList<ArrayList<String>> finalList = new ArrayList<ArrayList<String>>();

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return this.item;
    }

    public void addToList(String str) {
        this.list.add(str);
    }

    public ArrayList<String> getList() {
        return this.list;
    }

    public void addToFinalList(ArrayList<String> flist) {
        finalList.add(flist);
    }

    public ArrayList<ArrayList<String>> getFinalList() {
        return this.finalList;
    } 

    public String toString() {
        return finalList.toString();
    }
} 
