package com.gordonmzizi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import javax.sql.DataSource;


@Configuration
@ComponentScan("com.gordonmzizi")
@PropertySource("classpath:application-pre-prod.properties")
public class AppConfig {

    @Bean
    public DataSource dataSource(){
       SingleConnectionDataSource dataSource = new SingleConnectionDataSource();
       dataSource.setDriverClassName("org.h2.Driver");
       dataSource.setUrl("jdbc:h2:file:~/Desktop/mydb;AUTO_SERVER=TRUE;DB_CLOSE_ON_EXIT=FALSE");
       dataSource.setUsername("sa");
       dataSource.setPassword("");

       return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return  new JdbcTemplate(dataSource());
    }
}
