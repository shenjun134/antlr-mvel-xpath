package com.jun.mvel;

import java.util.ArrayList;
import java.util.List;

public class MvelAssertUtil {
    private List<MvelTestcase> testCaseList = new ArrayList<>();

    public List<MvelTestcase> getTestCaseList() {
        return testCaseList;
    }

    public void setTestCaseList(List<MvelTestcase> testCaseList) {
        this.testCaseList = testCaseList;
    }

    public MvelTestcase equals(Object input, Object output, String message){
        MvelTestcase testcase = new MvelTestcase(input,output, message);
        this.testCaseList.add(testcase);
        return testcase;
    }

    public MvelTestcase equals(Object input, Object output){
        MvelTestcase testcase = new MvelTestcase(input,output);
        this.testCaseList.add(testcase);
        return testcase;
    }

    public void validate(){
        for(MvelTestcase testcase : testCaseList){
            testcase.validate();
        }
    }
}
