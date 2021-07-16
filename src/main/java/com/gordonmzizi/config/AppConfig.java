package com.gordonmzizi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.gordonmzizi")
@PropertySource("classpath:application-pre-prod.properties")
public class AppConfig {
}
