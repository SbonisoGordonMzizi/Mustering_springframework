package com.gordonmzizi;

public class MyService {
    private MyRepository repository;

    //Implementing Constractor DI

    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public void getBusinessLogic(){
        System.out.println("Doing Business Logic");
        repository.getQuery();
    }
}
