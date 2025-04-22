package com.overload;

public class OverloadDemo {
    public void test(){
        System.out.println("test method is calling...");
    }
    public void test(int param){
        System.out.println("param value: "+ param);
    }
    public void test(int param1, int param2){
        System.out.println("param1 value: "+ param1+ "param2: "+ param2);
    }
    public double test(double param){
        System.out.println("(double) param value: "+ param);
        return param;
    }
    public static void main(String[] args) {
        OverloadDemo demo=new OverloadDemo();
        demo.test();
        demo.test(96);
        demo.test(12,23);
        demo.test(456.12);
    }
}
