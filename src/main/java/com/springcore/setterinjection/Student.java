package com.springcore.setterinjection;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private Address address;
    private List<String> subjects;

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Subjects: " + subjects);
    }
}

