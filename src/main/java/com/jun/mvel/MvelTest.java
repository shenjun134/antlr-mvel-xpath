package com.jun.mvel;

import org.apache.commons.io.FileUtils;
import org.mvel2.MVEL;
import org.mvel2.integration.VariableResolverFactory;
import org.mvel2.integration.impl.MapVariableResolverFactory;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MvelTest {

    public static void main(String[] args) throws Exception {
        String mvelPath = "mvel/xpath-function-def.mvel";
        Map context = new HashMap();
        String expression = FileUtils.readFileToString(new File(mvelPath), "utf-8");
        VariableResolverFactory functionFactory = new MapVariableResolverFactory(context);

        Serializable compileExpression = MVEL.compileExpression(expression);
        Object result = MVEL.executeExpression(compileExpression, context, functionFactory);
        System.out.println(result);
    }
}
