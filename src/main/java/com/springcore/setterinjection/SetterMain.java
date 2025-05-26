package com.springcore.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/setterinjection/setterInjectionConfig.xml");
        Student student = (Student) context.getBean("student");
        student.display();
    }
}

