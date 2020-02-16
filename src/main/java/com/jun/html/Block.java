package com.jun.html;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Block {
    private List<List<String>> tableData;
    private String category;
    private boolean xpath;
    private boolean example;
    private BlockTypeEnum type;
    private String html;
    private List<String> xpathList;
    private List<String> exampleList;

    public static Block newHead3() {
        return new Block(BlockTypeEnum.HEAD3);
    }

    public static Block newTable() {
        return new Block(BlockTypeEnum.TABLE);
    }

    public static Block newCode() {
        return new Block(BlockTypeEnum.CODE);
    }

    public Block(BlockTypeEnum type) {
        this.type = type;
    }

    public List<List<String>> getTableData() {
        return tableData;
    }

    public Block setTableData(List<List<String>> tableData) {
        this.tableData = tableData;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Block setCategory(String category) {
        this.category = category;
        return this;
    }

    public boolean isXpath() {
        return xpath;
    }

    public Block setXpath(boolean xpath) {
        this.xpath = xpath;
        return this;
    }

    public boolean isExample() {
        return example;
    }

    public Block setExample(boolean example) {
        this.example = example;
        return this;
    }

    public BlockTypeEnum getType() {
        return type;
    }

    public Block setType(BlockTypeEnum type) {
        this.type = type;
        return this;
    }

    public String getHtml() {
        return html;
    }

    public Block setHtml(String html) {
        this.html = html;
        return this;
    }

    public List<String> getXpathList() {
        return xpathList;
    }

    public Block setXpathList(List<String> xpathList) {
        this.xpathList = xpathList;
        return this;
    }

    public List<String> getExampleList() {
        return exampleList;
    }

    public Block setExampleList(List<String> exampleList) {
        this.exampleList = exampleList;
        return this;
    }

    public Block parseCode(String code){
        if(xpathList == null){
            xpathList = new ArrayList<String>();
        }
        xpathList.addAll(Arrays.asList(code.split("\n")));
        xpath = true;
        return this;
    }

    public List<List<String>> buildXpath(){
        List<List<String>> list = new ArrayList<List<String>>();
        list.add(new ArrayList<String>(){{
            add("head");
            add(category);
        }});
        for(final String xp : xpathList){
            list.add(new ArrayList<String>(){{
                add("xpath");
                add(xp);
            }});
        }
        return list;
    }


    public Block print(){
        switch (type){
            case CODE:{
                printXpath();
                break;
            }
            case HEAD3:{
                System.out.println("Head:" + html);
                break;
            }
            case TABLE:{
                printXpath();
                break;
            }
        }
        return this;
    }
    private void printXpath(){
        System.out.println("Head:" + category);
        if(xpath){
            for(String xp : xpathList){
                System.out.println(xp);
            }
        }
    }


}
