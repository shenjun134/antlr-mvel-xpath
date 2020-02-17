package com.jun.html;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class XPathFunctionGetter {

  private static final Logger logger = LoggerFactory.getLogger(XPathFunctionGetter.class);

  interface Template {
    String functionBegin =
        "//################################################### %s function begin";
    String functionEnd = "//################################################### %s function begin";
    //        String functionBegin = "%s";
    //        String functionEnd = "";
    String functionSplitter =
        "/****************************** I am a split ********************************/";
    //        String functionSplitter = "";
    String functionBefore = "/**\n* original function is %s\n* %s\n**/\n";
    String functionBody = "{\n  //TODO %s\n  notImpl('%s', [%s]);\n}";
  }

  interface Constant {
    String[] chinese =
        new String[] {
          "存取函数",
          "错误和跟踪函数",
          "有关数值的函数",
          "有关字符串的函数",
          "针对 anyURI 的函数",
          "关于布尔值的函数",
          "有关持续时间、日期和时间的函数",
          "与 QNames 相关的函数",
          "关于节点的函数",
          "有关序列的函数",
          "上下文函数"
        };
    String[] english =
        new String[] {
          "Access function",
          "Error and trace functions",
          "Functions related to numerical values",
          "Functions on Strings",
          "Functions for anyURI",
          "Functions on Boolean Values",
          "Functions on Duration, Date and Time",
          "Functions Related to QNames",
          "On Functions of Nodes",
          "Functions related to sequences",
          "Context function"
        };
    Map<String, String> functionMap =
        new HashMap<String, String>() {
          {
            for (int i = 0, len = chinese.length; i < len; i++) {
              put(chinese[i], english[i]);
            }
          }
        };
    Map<String, String> paramMap =
        new HashMap<String, String>() {
          {
            put("int", "numInt");
            put("float", "numFloat");
            put("double", "numDouble");
            put("string", "str");
          }
        };
    String commonFunction = "common-function";
    String testFunction = "test-function";
  }

  public static String getFunc(String name) {
    return Constant.functionMap.get(name);
  }

  public static Map<String, String> funcMap = new HashMap<>();
  public static Map<String, String> testMap = new HashMap<>();
  public static String xpathOutTemplate;

  static {
    String functionPath = "mvel/function";
    File dir = new File(functionPath);
    File[] files = dir.listFiles();
    if (files != null && files.length > 0) {
      for (File file : files) {
        String name = file.getName();
        if (StringUtils.endsWith(name, ".mvel")) {
          name = StringUtils.substringBefore(name, ".mvel");
          try {
            funcMap.put(name, FileUtils.readFileToString(file, "utf-8"));
          } catch (IOException e) {
            e.printStackTrace();
          }
        } else if (StringUtils.endsWith(name, ".test")) {
          name = StringUtils.substringBefore(name, ".test");
          try {
            testMap.put(name, FileUtils.readFileToString(file, "utf-8"));
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
    }
    try {
      xpathOutTemplate = FileUtils.readFileToString(new File("mvel/out-template.txt"), "utf-8");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws Exception {
    String docPath = "html/xpath-function.html";
    String mvel2XpathTemplate = "mvel/xpath-function-def.mvel";
    String xpathFuncList = "mvel/xpath-function-list.mvel";
    String docStr = FileUtils.readFileToString(new File(docPath), "utf-8");
    StringBuilder builder = new StringBuilder();
    StringBuilder funcBuilder = new StringBuilder();
    Document doc = Jsoup.parse(docStr);
    Element main = doc.selectFirst("#maincontent");
    List<Node> childNodes = main.childNodes();
    Map<String, List<MvelFunc>> mvelFuncMap = new HashMap<>();
    int total = 0;
    for (Node node : childNodes) {
      if (node instanceof Element) {
        Element part = (Element) node;
        boolean re = parse(part, builder, funcBuilder, mvelFuncMap);
        if (re) {
          total++;
        }
      }
    }
    StringBuilder testBuilder = new StringBuilder();
    testBuilder.append(funcMap.get(Constant.testFunction));
    for (String test : testMap.values()) {
      testBuilder.append("\n").append(test);
    }
    logger.debug("total:{}", total);
    String out =
        String.format(
            xpathOutTemplate,
            builder.toString(),
            funcMap.get(Constant.commonFunction),
            testBuilder);
    FileUtils.writeStringToFile(new File(mvel2XpathTemplate), out);
    FileUtils.writeStringToFile(new File(xpathFuncList), funcBuilder.toString());
    List<MvelFunc> finalFunc = new ArrayList<>();
    for(List<MvelFunc> list : mvelFuncMap.values()){
      String location = "mvel/template/" + list.get(0).getFuncName() + ".mvel";
      StringBuilder tempBuilder = new StringBuilder();
      int i = 0;
      Collections.sort(list, new Comparator<MvelFunc>() {
        @Override
        public int compare(MvelFunc o1, MvelFunc o2) {
          return o1.getKey().compareTo(o2.getKey());
        }
      });
      for(MvelFunc func : list){
        i++;
        if(list.size() > 1){
          func.setFuncName( func.getFuncName() + i);
        }
        tempBuilder.append(func.buildOut());
        MvelFunc newFunc = new MvelFunc();
        newFunc.setFuncName(func.getFuncName());
        newFunc.setParams(func.getParams());
        newFunc.setSrc(func.getSrc());
        newFunc.setCategory(func.getCategory());
        newFunc.setOverrideCount(list.size());
        newFunc.setKey(func.getKey());
        finalFunc.add(newFunc);
      }
      FileUtils.writeStringToFile(new File(location), tempBuilder.toString());
    }
    String configPath = "mvel/xpath-mvel-config.json";
    Gson gson = new GsonBuilder().create();
    FileUtils.writeStringToFile(new File(configPath), gson.toJson(finalFunc));
  }

  public static boolean parse(
      Element part,
      StringBuilder builder,
      StringBuilder funcBuilder,
      Map<String, List<MvelFunc>> mvelFuncMap) {
    Element headE = part.selectFirst("h2 a");
    Element table = part.selectFirst("table.dataintable");
    if (headE == null || table == null) {
      return false;
    }
    String head = headE.html();
    head = getFunc(head);
    builder.append(String.format(Template.functionBegin, head)).append("\n");
    LinkedHashMap<String, MvelFunc> mvelFuncLinkedHashMap = new LinkedHashMap<>();
    try {
      Elements rowList = table.select("tr");
      for (Element row : rowList) {
        Element td = row.selectFirst("td");
        if (td == null) {
          continue;
        }
        List<String> list = new ArrayList<>();
        Elements liList = td.select("li");
        if (liList != null && liList.size() > 0) {
          for (Element li : liList) {
            list.add(li.html());
          }
        } else {
          String[] array = td.html().split("\n");
          list.addAll(Arrays.asList(array));
        }
        for (String func : list) {
          MvelFunc mvelFunc = paramFunc(func);
          mvelFunc.buildKey();
          List<MvelFunc> tempList = mvelFuncMap.get(mvelFunc.getFuncName());
          if(tempList == null){
            tempList = new ArrayList<>();
            mvelFuncMap.put(mvelFunc.getFuncName(), tempList);
          }
          tempList.add(mvelFunc);
          mvelFunc.setCategory(head);
          funcBuilder
              .append(mvelFunc.buildShortOut())
              .append("\t\t")
              .append(mvelFunc.getSrc())
              .append("\n");
          MvelFunc temp = mvelFuncLinkedHashMap.get(mvelFunc.getFuncName());
          if (temp == null) {
            mvelFuncLinkedHashMap.put(mvelFunc.getFuncName(), mvelFunc);
          } else {
            logger.debug("duplicate:" + temp.getFuncName());
            temp.overrideCountPlus();
            if (temp.getParams().size() < mvelFunc.getParams().size()) {
              mvelFunc.setOverrideCount(temp.getOverrideCount());
              mvelFuncLinkedHashMap.put(mvelFunc.getFuncName(), mvelFunc);
            }
          }
        }
      }
      for (MvelFunc func : mvelFuncLinkedHashMap.values()) {
        String out = funcMap.get(func.getFuncName());
        //
        // funcBuilder.append(func.getFuncName()).append("\t\t\t").append(func.getSrc()).append("\n");
        if (out == null) {
          func.buildOut();
          builder.append(func.getOut());
        } else {
          builder.append(out);
        }
      }
    } finally {
      builder.append(String.format(Template.functionEnd, head)).append("\n");
      builder.append(Template.functionSplitter).append("\n");
    }
    return true;
  }

  public static MvelFunc paramFunc(String func) {
    MvelFunc mvelFunc = new MvelFunc();
    mvelFunc.setSrc(func);
    mvelFunc.setOverrideCount(1);
    String realFunc = func.replace(":", "_").replace("-", "_");
    //                   String name = realFunc.substring(0, realFunc.indexOf("("));
    if (realFunc.indexOf(",...") != -1) {
      realFunc = realFunc.replace(",...", "");
      mvelFunc.setDynamicParams(true);
    }
    realFunc = realFunc.replace(".", "_");
    handleParam(realFunc, mvelFunc);
    return mvelFunc;
  }

  public static void handleParam(String funcDecl, MvelFunc func) {
    String funcName = StringUtils.substringBefore(funcDecl, "(");
    String param = StringUtils.substringBetween(funcDecl, "(", ")");
    List<String> list = new ArrayList<>();
    int startIndex = 0;
    if (funcDecl.indexOf("(") != funcDecl.lastIndexOf("(")) {
      logger.debug(funcName);
      logger.debug(param);
      param = StringUtils.substring(funcDecl, funcDecl.lastIndexOf("("), funcDecl.lastIndexOf(")"));
      logger.debug(param);
      param = StringUtils.substring(funcDecl, funcDecl.indexOf(")") + 1, funcDecl.lastIndexOf(")"));
      logger.debug(param);
      startIndex = 1;
      logger.debug(funcDecl);
      String innerParam =
          StringUtils.substring(funcDecl, funcDecl.lastIndexOf("(") + 1, funcDecl.indexOf(")"));
      String[] innerArray = innerParam.split(",");
      String multiple = innerArray[0] + "Array";
      list.add(multiple);
      logger.debug(multiple);
    }

    if (param.trim().length() > 0) {
      String[] array = param.split(",");
      Map<String, Integer> map = new HashMap<>();
      for (; startIndex < array.length; startIndex++) {
        String p = array[startIndex];
        String p2 = Constant.paramMap.get(p);
        p2 = p2 == null ? p : p2;
        Integer p2Count = map.get(p2);
        if (p2Count == null) {
          p2Count = 1;
          map.put(p2, p2Count);
          list.add(p2);
        } else {
          map.put(p2, p2Count + 1);
          list.add(p2 + p2Count + 1);
        }
      }
    }
    func.setFuncName(funcName);
    func.setParams(list);
  }
}
