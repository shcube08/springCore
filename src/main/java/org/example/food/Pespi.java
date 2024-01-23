package org.example.food;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pespi implements InitializingBean, DisposableBean {

    private double price;

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pespi{" +
                "price=" + price +
                '}';
    }

    public void setPrice(double price) {
        System.out.println("setting pepsi price");
        this.price = price;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside pepsi destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside  pepsi init");
    }
}
