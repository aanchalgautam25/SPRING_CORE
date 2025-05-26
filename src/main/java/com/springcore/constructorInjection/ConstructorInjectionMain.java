package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMain {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/constructorConfig.xml");
        Student s1 = (Student) context.getBean("student");
        s1.display();

    }
}
