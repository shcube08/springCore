package org.example.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
        Add p1 = (Add) context.getBean("3");
        System.out.println(p1);
    }
}
