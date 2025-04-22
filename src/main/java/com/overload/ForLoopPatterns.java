package com.overload;

public class ForLoopPatterns {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }*/
        int n =10;
        for (int i=1; i<=n; i++)
        {
            for (int j=i; j<=n; j++)
            {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

}
