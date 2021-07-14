package com.gordonmzizi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyRepository repository;

    @Autowired
    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public void getBusinessLogic(){
        System.out.println("Doing Business Logic");
        repository.getQuery();
    }


}
