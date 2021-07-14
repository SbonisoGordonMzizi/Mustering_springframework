package com.gordonmzizi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        MyService bean = ctx.getBean(MyService.class);
        bean.getBusinessLogic();
    }
}
