package com.gordonmzizi;

import com.gordonmzizi.businesslogic.MyService;
import com.gordonmzizi.businesslogic.MyServiceImpl;
import com.gordonmzizi.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService bean = ctx.getBean(MyServiceImpl.class);
        bean.getBusinessLogic();
    }
}
