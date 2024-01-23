package org.example.food;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ragada {
    private String price;

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ragada{" +
                "price='" + price + '\'' +
                '}';
    }

    public void setPrice(String price) {
        System.out.println("setting");
        this.price = price;
    }
    @PostConstruct
    public void start(){
        System.out.println("begin");
    }
    @PreDestroy
    public  void end(){
        System.out.println("end");
    }
}
