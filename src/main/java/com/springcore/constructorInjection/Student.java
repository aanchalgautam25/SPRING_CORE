package com.springcore.constructorInjection;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private Address address;    // Reference injection
    private List<String> skills;

    public Student(int id, String name, Address address, List<String> skills) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.skills = skills;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Skills: " + skills);
    }
}
