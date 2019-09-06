package com.classpath.myapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int age;
}