package com.kevin.demodependency.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Department")
public class Department {

    @Id
    private String id;

    @Indexed(name = "deptName")
    private String name;
    private String description;

    //@DBRef
    private List employees;

}