package com.jun.html;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class MvelFunc {
  private String src;
  private String out;
  private String funcName;
  private List<String> params;
  private int overrideCount;
  private boolean dynamicParams;
  private String category;
  private String key;

  public String buildOut() {
    String dynamicParamsStr = "";
    if (dynamicParams) {
      dynamicParamsStr = "the last param is ...";
    }
    String params = StringUtils.join(this.getParams(), ",");
    String head = "def " + this.getFuncName() + "(" + params + ")";
    String overrideStr =
        overrideCount > 1 ? String.format("Override count:%d ", overrideCount) : " ";
    String before = String.format(XPathFunctionGetter.Template.functionBefore, src, overrideStr + "\n* Function key:" + key);
    String body =
        String.format(
            XPathFunctionGetter.Template.functionBody,
            dynamicParamsStr,
            this.getFuncName(),
            params);
    out = before + head + body + "\n";
    return out;
  }

  public void buildKey(){
    this.key = funcName + ":" + params.size();
  }

  public String buildKey(String funcName, int paramsLength){
    return funcName + ":" + paramsLength;
  }

  public String buildShortOut() {
    StringBuilder builder = new StringBuilder();
    builder.append("def ").append(funcName).append("(").append(StringUtils.join(params, ",")).append(")");
    return builder.toString();
  }

  public void overrideCountPlus() {
    overrideCount++;
  }

  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public String getOut() {
    return out;
  }

  public void setOut(String out) {
    this.out = out;
  }

  public String getFuncName() {
    return funcName;
  }

  public void setFuncName(String funcName) {
    this.funcName = funcName;
  }

  public List<String> getParams() {
    return params;
  }

  public void setParams(List<String> params) {
    this.params = params;
  }

  public int getOverrideCount() {
    return overrideCount;
  }

  public void setOverrideCount(int overrideCount) {
    this.overrideCount = overrideCount;
  }

  public boolean isDynamicParams() {
    return dynamicParams;
  }

  public void setDynamicParams(boolean dynamicParams) {
    this.dynamicParams = dynamicParams;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }
}
