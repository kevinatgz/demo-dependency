package com.example.demodependency.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Employee")
@Data
public class Employee {

    @Id
    private String empId;
    private String name;
    private int age;
    private double salary;

//getters and setters

}