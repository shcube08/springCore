package org.example.list;


import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private Set<String> number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getNumber() {
        return number;
    }

    public void setNumber(Set<String> number) {
        this.number = number;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    private Map<String,String> address;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", address=" + address +
                '}';
    }
}
