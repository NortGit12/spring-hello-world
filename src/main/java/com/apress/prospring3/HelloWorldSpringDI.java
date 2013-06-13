package com.apress.prospring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {

    public static void main(String[] args) {
        // Initialize the Spring application context
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/coolest-config-file-ever.xml");

        // Get an instance of the bean and use it
        MessageRenderer mr = ctx.getBean("niftyRenderer", MessageRenderer.class);
        mr.render();
    }

}