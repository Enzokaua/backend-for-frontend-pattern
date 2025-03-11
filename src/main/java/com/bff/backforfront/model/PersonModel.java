package com.bff.backforfront.model;

import org.springframework.stereotype.Service;

@Service
public class PersonModel {
    private String name;
    private int age;
    private String application;

    public String getApplication() {
        return application;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
