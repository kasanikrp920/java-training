package com.trimindtech.training.day2;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        int planno;
        System.out.println("enter which plan do u want");
        Scanner sc =new Scanner(System.in);
        planno=sc.nextInt();
        if(planno>0){
            switch (planno){
                case 1:
                    System.out.println("the company pays for all ");
                    break;
                case 2:
                    System.out.println("company pays 4.65% amount");
                    break;
                case 3:
                    System.out.println("company pays 7.85% amount");
                    break;
                case 4:
                    System.out.println("company pays 5.50% amount");
                    break;
                default:
                    System.out.println("enter a valid plan");
            }
        }else{
            System.out.println("enter positive plano");
        }

    }
}
