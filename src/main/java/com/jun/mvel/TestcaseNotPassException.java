package com.jun.mvel;

public class TestcaseNotPassException extends RuntimeException{
    public TestcaseNotPassException() {
    }

    public TestcaseNotPassException(String message) {
        super(message);
    }

    public TestcaseNotPassException(String message, Throwable cause) {
        super(message, cause);
    }

    public TestcaseNotPassException(Throwable cause) {
        super(cause);
    }

    public TestcaseNotPassException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
