package com.gordonmzizi.businesslogic;

import com.gordonmzizi.persistance.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    private MyRepository repository;

    //@Qualifier annotation takes a name of instance bean
    @Autowired
    public MyServiceImpl(@Qualifier(value = "myRepositoryImpl") MyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void getBusinessLogic(){
        System.out.println("Doing Business Logic");
        repository.getQuery();
    }


}
