package com.overload;

public class ContinueDemo {
    public static void main(String[] args){
        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
            return ;
        }
        System.out.println("after the for loop");
        /*int value=50;
        while(value>0){
            if(value==25) {
                value--;
                break;
            }
            System.out.println("value: "+ value);
            value--;


        }*/
    }
}
