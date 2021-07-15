package com.gordonmzizi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.gordonmzizi");
        MyService bean = ctx.getBean(MyService.class);
        bean.getBusinessLogic();
    }
}
