package com.trimindtech.training.day2;

import java.util.Scanner;

public class Hoursrate {
    public static void main(String[] args) {
        int sal=1;
        Scanner p=new Scanner(System.in);
        System.out.println("enter the no of hours");
        int no_of_hrs=p.nextInt();
        if(no_of_hrs>40)
        {
            double amnt=(40*sal)+ (no_of_hrs-40)*1.5;
            System.out.println(amnt);
        }else{
            double amnt=no_of_hrs*sal;
            System.out.println(amnt);
        }
    }
}
