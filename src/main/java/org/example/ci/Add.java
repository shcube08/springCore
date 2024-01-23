package org.example.ci;

public class Add {

    private int a;
    private int b;

    public Add(float a, float b){
        this.a= (int) a;
        this.b= (int) b;
        System.out.println("this is float,float");
    }
    public Add(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("this is int,int");
    }
    public Add( String a, String b){
        this.a= Integer.parseInt(a);
        this.b= Integer.parseInt(b);
        System.out.println("this is string,string");
    }

    @Override
    public String toString() {
        return "Add{" + "a=" + a + ", b=" + b + ", sum="+(a+b)+'}';
    }
}
