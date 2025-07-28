package com.springcore.annotationByType;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("autowireByType.xml");
        Car myCar = context.getBean("myCar", Car.class);
        myCar.displayDetails();
    }
}
