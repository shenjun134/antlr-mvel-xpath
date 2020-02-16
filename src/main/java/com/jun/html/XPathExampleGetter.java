package com.jun.html;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XPathExampleGetter {

    public static void main(String[] args) throws Exception {
        String url = "http://caibaojian.com/scb/xpath.html";
//        Document doc = Jsoup.connect(url).get();
        String docPath = "html/xpath-example.html";
        String docStr = FileUtils.readFileToString(new File(docPath), "utf-8");
        List<List<String>> csvList = new ArrayList<List<String>>();

        Document doc = Jsoup.parse(docStr);
        Element main = doc.selectFirst("main");
        List<Node> childNodes =  main.childNodes();
        List<Block> blockList = new ArrayList<Block>();
        String previousHead = null;
        Map<String, Block> codeMap = new HashMap<String, Block>();
        for(Node node : childNodes){
            if(node instanceof Element){
                Element child = (Element)node;
                if(child.is("h3")){
                    String html = child.html();
                    Block block = Block.newHead3().setHtml(html);
                    blockList.add(block);
                    previousHead = html;
                }
                if(child.is("pre")){
                    Element code = child.selectFirst("code");
                    Block block = codeMap.get(previousHead);
                    if(block == null){
                        block = Block.newCode().setHtml(code.html());
                        block.setCategory(previousHead);
                        blockList.add(block);
                        codeMap.put(previousHead, block);
                    }
                    block.parseCode(code.html());
                }
                if(child.is("table")){
                    Block block = parseTable(child);
                    block.setCategory(previousHead);
                    blockList.add(block);
                }
            }
        }
        for(Block block : blockList){
            if(block.getType() == BlockTypeEnum.HEAD3){
                continue;
            }
            csvList.addAll(block.buildXpath());
            block.print();
        }
        save("xpath.csv", csvList);
//        StringBuilder builder = new StringBuilder();
//        for(List<String> row : csvList){
//            for(String r : row){
//                builder.append("\"").append(r).append("\",");
//            }
//            builder.append("\n");
//        }
//        Path path = Paths.get("out.csv");
//        BufferedWriter bfw=Files.newBufferedWriter(path);
//        bfw.write(builder.toString());
//        bfw.flush();
//        bfw.close();
    }

    public static void save(String fileName, List<List<String>> list) throws IOException {
        FileWriter fileWriter;
        CSVPrinter csvPrinter = null;
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        try {
            fileWriter = new FileWriter(fileName);
            csvPrinter = new CSVPrinter(fileWriter, csvFormat);
            csvPrinter.printRecords(list);
        } finally {
            try {
                if (csvPrinter != null) {
                    csvPrinter.flush();
                    csvPrinter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static Block parseTable(Element table){
        Block block = Block.newTable();
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> xpathList = new ArrayList<String>();

        block.setTableData(list);
        block.setXpathList(xpathList);
//        Element head = table.selectFirst("thead");
//        Elements body = table.select("tbody");
        Elements rowList = table.select("tr");
        int xpathIndex = -1;
        boolean xpath = false;
        for(Element row : rowList){
            List<String> temp = new ArrayList<String>();
            List<Node> nodes  = row.childNodes();
            int i = -1;
            for(Node node : nodes){
                i++;
                if(node instanceof Element){
                    if(((Element) node).is("th")){
                        String head = ((Element) node).html();
                        if("xpath".equalsIgnoreCase(head.trim()) || "example".equalsIgnoreCase(head.trim())){
                            xpathIndex = i;
                            xpath = true;
                        }
                        temp.add(head);
                    }else if(((Element) node).is("td")  ){
                        Element code = ((Element) node).selectFirst("code");
                        if(code != null){
                            String html = code.html();
                            temp.add(html);
                            if(xpath && xpathIndex == i){
                                xpathList.add(html);
                            }
                        }else {
                            temp.add(null);
                        }


                    }else{
                        temp.add(null);
                    }
                }
            }
            list.add(temp);
        }
        block.setXpath(xpath);
        return block;
    }
}
