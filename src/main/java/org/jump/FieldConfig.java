package org.jump;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

import org.jump.grammer.*;

public class FieldConfig {
    private String fieldName;

    private String fnName;

    private ArrayList<String> params;

    public FieldConfig(String fieldName, String fnName, ArrayList<String> params) {
        this.fieldName = fieldName;
        this.fnName = fnName;
        this.params = params;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFnName() {
        return fnName;
    }

    public ArrayList<String> getParams() {
        return params;
    }
}
