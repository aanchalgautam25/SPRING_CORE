package com.springcore.beanlifecycleAnnotations;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com.springcore.beanlifecycleAnnotations.config.xml");
        AnnotatedBean bean =(AnnotatedBean) context.getBean("mybean");
        System.out.println(bean);
    }
}


