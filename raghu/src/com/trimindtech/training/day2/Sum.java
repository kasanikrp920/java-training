package com.trimindtech.training.day2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int x,sum=0;
        Scanner s=new Scanner(System.in);
        do{
            System.out.println("enter the value for x");
            x=s.nextInt();
            sum=sum+x;
        }while(x!=0);
        System.out.println("sum of ur given nos is  "+sum);
    }
}
