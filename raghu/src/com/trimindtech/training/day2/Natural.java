package com.trimindtech.training.day2;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        int i=0,n,sum=0;
        Scanner p=new Scanner(System.in);
        System.out.println("enter the range to sum the nos");
        n=p.nextInt();
        while(i<=n){
            sum=sum+i;
            i++;
        }

        System.out.println(sum);
    }
}
