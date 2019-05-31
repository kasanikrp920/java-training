package com.trimindtech.training.day2;

import java.util.Scanner;

public class NoInArr {
    public static void noExist(int x) {
        int[] arr = {10, 34, 27, 45, 72};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("the given num exist in te array i.e  " + x);
                break;
            }
            else {
                System.out.println("the given num not exist in te array i.e  " + x);
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the no that u want to check....");
        Scanner v=new Scanner(System.in);
        int a=v.nextInt();
        noExist(a);
    }

    }
