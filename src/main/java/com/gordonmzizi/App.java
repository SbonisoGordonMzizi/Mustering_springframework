package com.gordonmzizi;

import com.gordonmzizi.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {
        new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
