package com.apress.prospring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("configurableProvider")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

    /**
     * Constructor used with xml configuration
     * @param message
     */
//    public ConfigurableMessageProvider(String message) {
//        this.message = message;
//    }

    /**
     * Constructor used with annotation configuration
     * @return
     */
    @Autowired
    public ConfigurableMessageProvider(@Value("This is a configurable message. (annotation overrride - constructor injection)") String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}