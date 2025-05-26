package com.springcore.setterinjection;

public class Address {
    private String city;
    private String state;

    // Setters
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}

