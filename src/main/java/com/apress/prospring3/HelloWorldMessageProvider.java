package com.apress.prospring3;

public class HelloWorldMessageProvider implements MessageProvider {

    private String message = "Hello World!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}