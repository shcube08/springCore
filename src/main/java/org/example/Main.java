package org.example;


import org.example.list.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Emp s1= (Emp) context.getBean("emp1");
//        System.out.println(context.getBean("student1"));
//        System.out.println(context.getBean("student2"));
        System.out.println(s1.getAddress());

    }
}