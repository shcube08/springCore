package org.example.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autoConfig.xml");
       Emp obj = context.getBean("2", Emp.class);

        System.out.println(obj);
    }
}
