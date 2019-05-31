package com.trimindtech.training.day2;

import java.util.Scanner;

public class TaxMethod {
    public static void calTaxForSingle(int sal) {
        if (sal <= 6000) {
            int tax = (sal * 10) / 100;
            System.out.println(tax);
        }else if((sal>6000)&&(sal<=27950)){
            int tax=(sal*15)/100;
            System.out.println(tax);
        }else {
            int tax=(sal*27)/100;
            System.out.println(tax);
        }

    }
    public static void calTaxForWidow(int sal) {
        if (sal <= 12000) {
            int tax = (sal * 10) / 100;
            System.out.println(tax);
        }else if((sal>12000)&&(sal<=46700)){
            int tax=(sal*15)/100;
            System.out.println(tax);
        }else {
            int tax=(sal*27)/100;
            System.out.println(tax);
        }

    }
    public static void calTaxForMarriedsaparetely(int sal) {
        if (sal <= 6000) {
            int tax = (sal * 10) / 100;
            System.out.println(tax);
        }else if((sal>6000)&&(sal<=23350)){
            int tax=(sal*15)/100;
            System.out.println(tax);
        }else {
            int tax=(sal*27)/100;
            System.out.println(tax);
        }

    }
    public static void calTaxForHousehold(int sal) {
        if (sal <= 10000) {
            int tax = (sal * 10) / 100;
            System.out.println(tax);
        }else if((sal>6000)&&(sal<=37450)){
            int tax=(sal*15)/100;
            System.out.println(tax);
        }else {
            int tax=(sal*27)/100;
            System.out.println(tax);
        }

    }

    public static void main(String[] args) {

        System.out.println("enter 1 for single");
        System.out.println("enter 2 for widow");
        System.out.println("enter 3 for married saparately");
        System.out.println("enter 4 for house hold");
        Scanner sc=new Scanner(System.in);
        int ch =sc.nextInt();
        System.out.println("enter the salary of yours");
        int rsal=sc.nextInt();
        switch(ch){
            case 1:

                calTaxForSingle(rsal);
                      break;
            case 2:
                calTaxForWidow(rsal);
                      break;
            case 3:
                calTaxForMarriedsaparetely(rsal);
                     break;
            case 4:
                calTaxForHousehold(rsal);
                break;
            default:
                System.out.println("enter a valid choice");
        }

    }
}
