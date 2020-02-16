package com.jun.mvel;

import org.apache.commons.io.FileUtils;
import org.mvel2.MVEL;
import org.mvel2.integration.VariableResolverFactory;
import org.mvel2.integration.impl.MapVariableResolverFactory;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MvelTest {

    public static void main(String[] args) {
        String mvelPath = "mvel/xpath-function-def.mvel";
        Map context = new HashMap();
        MvelAssertUtil assertUtil = new MvelAssertUtil();
        context.put("assertUtil", assertUtil);
        String expression = null;
        try {
            expression = FileUtils.readFileToString(new File(mvelPath), "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        VariableResolverFactory functionFactory = new MapVariableResolverFactory(context);

        Serializable compileExpression = MVEL.compileExpression(expression);
        Object result = MVEL.executeExpression(compileExpression, context, functionFactory);
        System.out.println(result);
        assertUtil.validate();
    }
}
