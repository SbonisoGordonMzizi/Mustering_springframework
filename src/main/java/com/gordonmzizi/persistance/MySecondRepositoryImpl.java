package com.gordonmzizi.persistance;

import org.springframework.stereotype.Repository;

@Repository
public class MySecondRepositoryImpl implements MyRepository{
    @Override
    public void getQuery() {
        System.out.println("DELETE * FROM justdata");
    }
}
