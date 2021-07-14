package com.gordonmzizi;


import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public void getQuery(){
        System.out.println("SELECT * FROM database");
    }
}
