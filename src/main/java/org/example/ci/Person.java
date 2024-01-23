package org.example.ci;

public class Person {

    private  String name;
    private  B obj;
    private  int id;

    public Person(String name, B obj, int id) {
        this.name = name;
        this.obj = obj;
        this.id = id;
    }
    public void display(){
        System.out.println(this.name);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", obj=" + obj +
                ", id=" + id +
                '}';
    }
}
