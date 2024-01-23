package org.example.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("1")
    private Address address;
    private int x;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("setter");
        this.address = address;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("set x");
        this.x = x;
    }
public Emp(){
        super();
    }

    public Emp(Address address, int x) {
        System.out.println("constructor");
        this.address = address;
        this.x = x;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                ", x=" + x +
                '}';
    }
}
