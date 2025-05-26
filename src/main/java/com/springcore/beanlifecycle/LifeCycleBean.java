package com.springcore.beanlifecycle;

public class LifeCycleBean {
    private String data;

    public LifeCycleBean() {
        System.out.println("Constructor: LifeCycleBean object created.");
    }

    public void setData(String data) {
        this.data = data;
        System.out.println("Setter: Setting data = " + data);
    }

    public void init() {
        System.out.println("Init method: Performing initialization logic.");
    }

    public void destroy() {
        System.out.println("Destroy method: Performing cleanup logic.");
    }

    @Override
    public String toString() {
        return "LifeCycleBean{data='" + data + "'}";
    }
}
