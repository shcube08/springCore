package org.example.food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("foodConfig.xml");
        context.registerShutdownHook();
        System.out.println(context.getBean("3"));

        //System.out.println(context.getBean("2"));
    }
}
