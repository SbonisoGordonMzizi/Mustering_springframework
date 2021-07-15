package com.gordonmzizi.persistance;


import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {
    @Override
    public void getQuery(){
        System.out.println("SELECT * FROM database");
    }
}
