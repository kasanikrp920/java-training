package com.trimindtech.training.day2;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for i");
        i=sc.nextInt();
         if((i%3==0)&& (i%2==0))
        {
            System.out.println("hello world");
        }
        else if((i%2==0)){
            System.out.println("hello ");
        }else{
             System.out.println("world");
         }
    }
}
