package org.example.food;

import static java.lang.System.exit;

public class Pizza {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price of pizza");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("inside pizza init method");
    }
    public void destroy(){
        System.out.println("inside pizza destroy method");

    }
}
