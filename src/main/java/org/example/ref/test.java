package org.example.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        A a1 = (A) context.getBean("aref");
        System.out.println(a1);
    }
}
