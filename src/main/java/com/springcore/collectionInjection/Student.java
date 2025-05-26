package com.springcore.collectionInjection;

import java.util.Map;
import java.util.Set;

public class Student {
    private int rollNo;
    private String name;
    private Set<String> skills;
    private Map<String,Integer> courses;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    public Map<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Integer> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                ", courses=" + courses +
                '}';
    }
}

