package org.example.stand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("standConfig.xml");
        Bali ob = context.getBean("1", Bali.class);
        System.out.println(ob.getProp());
    }

}
