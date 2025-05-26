package com.springcore.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("com/springcore/beanlifecycle/config.xml");

        LifeCycleBean bean = (LifeCycleBean) context.getBean("lifeCycleBean");
        System.out.println("Using bean: " + bean);

        // Register shutdown hook to call destroy method
        context.registerShutdownHook();
    }
}

