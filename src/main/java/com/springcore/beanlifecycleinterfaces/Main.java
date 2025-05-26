package com.springcore.beanlifecycleinterfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/springcore/beanlifecycleinterfaces/config.xml");

        LifeCycleUsingInterfaces bean = (LifeCycleUsingInterfaces) context.getBean("lifeCycleBean");
        System.out.println("Using bean: " + bean);

        context.registerShutdownHook(); // triggers destroy()
    }
}

