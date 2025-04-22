package com.overload;

public class Box{
    double width;// instance variables
    double height;
    double depth;

    public Box(){
        // body of the constructor
        width=10;
        height=10;
        depth=10;
        System.out.println("default constructor is calling ");
    }
    public Box(double w,double height, double depth){
        this();
        this.width=w;
        this.height=height;
        this.depth=depth;

    }

    //type name(parameter-list){ body of the method }
    double volume(){//declare
        System.out.println("Volume of the Box ");
        return width*height*depth;
    }
    int square(int i,double da){
        return i*i;
    }
    public void setValues(double w, double h, double d){// local variables
        width=w;
        height=h;
        depth=d;
        this.volume();
        //Hotel --> id, name, address, streetId, streetName, pincode;
    }
}
