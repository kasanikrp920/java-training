package com.trimindtech.training.day2;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        int a, b, c;
        char opt;
        System.out.println("enter the values for a and b");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("enter the option for operation");
        opt = sc.next().charAt(0);
        if (opt == '+') {
            c = a + b;
            System.out.println(c);
        } else if (opt== '-') {
            c = a - b;
            System.out.println(c);
        } else if (opt == '*') {
            c = a * b;
            System.out.println(c);
        } else if (opt == '/') {
            c = a / b;
            System.out.println(c);
        } else if (opt == '%') {
            c = a % b;
            System.out.println(c);
        } else {
            System.out.println(" please enter the right option");
        }


    }
}
