package com.springcore.beanConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class BeanMain {
        public static void main( String[] args)
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanConfig/bean.xml");
            MyFirstBean bean = (MyFirstBean) context.getBean("mybean");
            System.out.println(bean);
        }
    }

