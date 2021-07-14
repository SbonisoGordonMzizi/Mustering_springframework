package com.gordonmzizi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    @Autowired
    private MyRepository repository;

    public void getBusinessLogic(){
        System.out.println("Doing Business Logic");
        repository.getQuery();
    }


}
