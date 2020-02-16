package com.jun.mvel;

import org.apache.commons.lang3.StringUtils;

public class MvelTestcase {
  private String caseName;
  private Object expected;
  private Object actual;
  private boolean pass;
  private String message;

  public MvelTestcase(Object input, Object output, String message) {
    this.expected = input;
    this.actual = output;
    this.message = message;
  }

  public MvelTestcase(Object input, Object output) {
    this.expected = input;
    this.actual = output;
  }

  public void validate() {
    if (expected == null && actual == null) {
      return;
    }
    if (expected == null || actual == null) {
      String result =
          String.format(
              "Fail case[%s] - [%s] expected:%s, actual:%s",
              caseName == null ? "" : caseName, message == null ? "" : message, expected, actual);
      throw new IllegalArgumentException(result);
    }
    boolean pass = StringUtils.equals(expected.toString(), actual.toString());
    String result =
        String.format(
            "Fail case[%s%s] expected:%s, actual:%s",
            caseName == null ? "" : caseName, message == null ? "" : ":" + message, expected, actual);
    if(!pass){
        throw new TestcaseNotPassException(result);
    }
    //    assert !pass : result;
  }

  public String getCaseName() {
    return caseName;
  }

  public void setCaseName(String caseName) {
    this.caseName = caseName;
  }

  public Object getExpected() {
    return expected;
  }

  public void setExpected(Object expected) {
    this.expected = expected;
  }

  public Object getActual() {
    return actual;
  }

  public void setActual(Object actual) {
    this.actual = actual;
  }

  public boolean isPass() {
    return pass;
  }

  public void setPass(boolean pass) {
    this.pass = pass;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
