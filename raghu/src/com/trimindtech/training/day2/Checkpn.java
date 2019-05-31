package com.trimindtech.training.day2;

import java.util.Scanner;

public class Checkpn {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("enter any no that u wanted to check");
        int i=m.nextInt();
        if(i>0){
            System.out.println(i+"  is a positive no...");
        }else{
            System.out.println(i+"  is a negative no...");
        }


    }
}
