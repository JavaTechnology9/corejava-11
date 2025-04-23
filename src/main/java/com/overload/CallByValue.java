package com.overload;

public class CallByValue {
    int a, b;
    public CallByValue(int x, int y){
        this.a=x;
        this.b=y;
    }
    // datatype mehtodName(parameter-list){ // body of the method
    public CallByValue update(CallByValue cbv){
        cbv.a=cbv.a+10;
        cbv.b=cbv.b-10;
        System.out.println("with in the update method "+ cbv);
        //System.out.println("x value: "+x);
        //System.out.println("y value: "+ y);
        //return new CallByValue(120,240);
        return cbv;
    }

    public static void main(String[] args) {
        CallByValue cbv=new CallByValue(10,20);
        CallByValue cbv2=new CallByValue(10,20);
        System.out.println("before calling a value: "+ cbv.a);
        System.out.println("before calling b value: "+ cbv.b);
        System.out.println("before calling the method: "+ cbv);
        cbv.update(cbv2);
        System.out.println("after calling a value: "+ cbv.a);// modification result
        System.out.println("after calling b value: "+ cbv.b);
    }
}
