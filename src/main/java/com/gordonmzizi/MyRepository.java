package com.gordonmzizi;

import org.springframework.stereotype.Component;

@Component
public class MyRepository {
    public void getQuery(){
        System.out.println("SELECT * FROM database");
    }
}
