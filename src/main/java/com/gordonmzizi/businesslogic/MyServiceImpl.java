package com.gordonmzizi.businesslogic;

import com.gordonmzizi.persistance.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service

public class MyServiceImpl implements MyService {
    private Environment environment;
    private MyRepository repository;
    @Value("${my.name:SBONISO}")
    private String name;

    //@Qualifier annotation takes a name of instance bean
    @Autowired
    public MyServiceImpl(@Qualifier(value = "myRepositoryImpl") MyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void getBusinessLogic(){
        System.out.println("Doing Business Logic "+name);
        repository.getQuery();
    }


    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
