package com.jun.gen;

import org.antlr.v4.Tool;

import java.io.File;

public class Gen {

    public static void main(String[] args){
        File current = new File(".");
        System.out.println(current.getAbsolutePath());
        String path = "src/main/java/com/almondtools/antlr4multichannel/";
        String currentPath = current.getAbsolutePath();
        String out =  currentPath.substring(0, currentPath.length() - 1) + path;
        System.out.println(out);
//        String out = "D:/data/code/antlr4multichannel-master/src/main/java/com/almondtools/antlr4multichannel/";
        args = new String[]{"-listener","-visitor", "-package", "com.almondtools.antlr4multichannel","-o",out,"grammar/XQueryParser.g4", "grammar/Example.g4"};
//        args = new String[]{"-listener","-visitor", "-package", "com.almondtools.antlr4multichannel", "-o",out,"grammar/XQueryParser.g4", "grammar/XQueryLexer.g4"};
////        args = new String[]{};
        Tool.main(args);
    }
}
