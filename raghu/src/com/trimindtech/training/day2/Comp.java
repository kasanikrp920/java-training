package com.trimindtech.training.day2;

import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
        int a,b;
        String result;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value for a");
        a=sc.nextInt();
        /*System.out.println("enter the value for b");
        b=sc.nextInt();
        int x=(a>b) ? a : b;
        System.out.println(x+" is max no");
        int y=(a<b) ? a : b;
        System.out.println(y+"  is min no");*/
        String s=(a%2==0)?a+" is even ":a+" is odd ";
        System.out.println(s);
    }
}
