package com.springcore.collectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args)
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/collectionInjection/Collectionbean.xml");
        Student s1 = (Student)context.getBean("student1");
        System.out.println(s1);
        Student s2 = (Student)context.getBean("student2");
        System.out.println(s2);


    }
}
