package com.overload;

import java.util.ArrayList;
import java.util.Scanner;

public class OverloadBanking {
    public OverloadBanking(){
        System.out.println("Default constructor");
    }
    public OverloadBanking(String param){
        System.out.println("one parameter constructor");
    }
    public OverloadBanking(int param1, double param2){
        System.out.println("two parameters: ");
    }
    public void deposit(){

    }
    public void deposit(double amount){

    }
    public void deposit(double amount, Order order){
        System.out.println("Deposit Amount: "+ amount);
        System.out.println("order id: "+ order.getId());
        System.out.println("order name: "+ order.getName());

    }

    public static void main(String[] args) {
        //Datatype refVar=new Constructor();
        OverloadBanking ob1=new OverloadBanking();
        OverloadBanking ob2=new OverloadBanking("Saving Account");
        OverloadBanking ob3=new OverloadBanking(45,963.124);
        Order order=new Order(123,"Mobiles");
        ob1.deposit(852.23,order);
        Integer.valueOf("").intValue();

    }
}
