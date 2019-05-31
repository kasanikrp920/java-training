package com.trimindtech.training.day2;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for i" + "");
        int i = sc.nextInt();
        if ((i > 0) && (i < 100)) {
            System.out.println("the value in between 1 to 100");
        }


    }
}
