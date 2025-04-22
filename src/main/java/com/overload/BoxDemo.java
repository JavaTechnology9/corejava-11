package com.overload;

import java.util.Scanner;

public class BoxDemo {
    public void process(){

    }
    public void test(){
        this.process();
    }

    public static void main(String[] args) {
        //Datatype variable=new constructor();
        Box box=new Box(10,20,30);
        //box.setValues(102.01,456.02,741.03);
        Box box2=new Box(40,50,60);
        //box2.setValues(96.12,85.23,74.34);
        System.out.println(box.volume());
        System.out.println(box2.volume());

        //Git hub
        //Arrays Methods


        //this.volume();
    }
}
