package com.apress.prospring3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloWorldSpringDI {

    public static void main(String[] args) {
        // Initialize the Spring application context
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("classpath:spring/coolest-app-context-xml.xml, spring/coolest-app-context-annotation.xml");
//        ctx.load("classpath:spring/coolest-app-context-xml.xml");
        ctx.load("classpath:spring/coolest-app-context-annotation.xml");
        ctx.refresh();

        // Get an instance of the bean and use it
        MessageProvider messageProvider = ctx.getBean("niftyProvider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }

}