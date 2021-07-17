package com.gordonmzizi.persistance;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class MyRepositoryImpl implements MyRepository {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public MyRepositoryImpl(DataSource dataSource, JdbcTemplate jdbcTemplate) {
        this.dataSource = dataSource;
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    @Override
    public void getQuery(){
        jdbcTemplate.execute("INSERT INTO employees VALUES (1,'Gordon','Mzizi')");
    }
}
