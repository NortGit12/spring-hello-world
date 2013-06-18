package com.apress.prospring3;

import org.springframework.stereotype.Service;

@Service("niftyProvider")
public class HelloWorldMessageProvider implements MessageProvider {

    private String message = "Hello World!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}