package com.overload;

public class Calculator {
    int abc;
    int xyz;
    public Calculator(){
        System.out.println("default constructor");
        abc=10;
        xyz=20;
    }
    public  Calculator(int a){
        System.out.println("one parameter constructor: "+ a);
        abc=xyz=a;
    }
    public Calculator(int a , int b){
        System.out.println("two parameter constructor: "+ a+", "+b);
        abc=a;
        xyz=b;
    }
    public boolean equals(Calculator obj){
        if(this.abc== obj.abc && this.xyz==obj.xyz) return true;
        else return false;
    }


    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    void add(int a, double b){

    }
    void add(double a, int b) {
    }

    public static void main(String[] args) {
            Calculator cal=new Calculator();
        System.out.println(cal.add(2,3));
        System.out.println(cal.add(12.01,24.2));
        System.out.println(cal.add(10,20,30));
        Calculator cal2=new Calculator(120);
        new Calculator(120,240);
        System.out.println(cal.equals(cal2));
    }
}
