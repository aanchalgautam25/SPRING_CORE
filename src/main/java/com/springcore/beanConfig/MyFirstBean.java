package com.springcore.beanConfig;

public class MyFirstBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyFirstBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
