package com.trimindtech.training.day2;

import java.util.Scanner;

public class Products {
    public static void main(String[] args) {
        System.out.println("enter 1 for product1");
        System.out.println("enter 2 for product2");
        System.out.println("enter 3 for product3");
        System.out.println("enter 4 for product4");
        System.out.println("enter 5 for product5");
        Scanner sc=new Scanner(System.in);
        int ch =sc.nextInt();
        System.out.println("enter the quantity that u have sold");
        double qunty =sc.nextDouble();
        double comission = 0.0;
        switch(ch){
            case 1:
                comission = 2.70;
                break;
            case 2: comission = 4.50;
                break;
            case 3:
                comission = 9.98;
                break;
            case 4: double amnt4=qunty*4.49;
                System.out.println(amnt4);
                break;
            case 5: double amnt5=qunty*6.67;
                System.out.println(amnt5);
                break;
            default :
                System.out.println("enter a valid choice");
        }
        System.out.println(qunty*comission);
    }
}
