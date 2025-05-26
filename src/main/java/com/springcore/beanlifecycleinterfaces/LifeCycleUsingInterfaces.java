package com.springcore.beanlifecycleinterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleUsingInterfaces implements InitializingBean, DisposableBean {
    private String data;

    public LifeCycleUsingInterfaces() {
        System.out.println("Constructor: Bean created.");
    }

    public void setData(String data) {
        this.data = data;
        System.out.println("Setter: Setting data = " + data);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet(): Custom init logic via InitializingBean.");
    }

    @Override
    public void destroy() {
        System.out.println("destroy(): Custom destroy logic via DisposableBean.");
    }

    @Override
    public String toString() {
        return "LifeCycleUsingInterfaces{data='" + data + "'}";
    }
}
