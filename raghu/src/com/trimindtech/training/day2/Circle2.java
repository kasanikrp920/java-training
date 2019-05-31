package com.trimindtech.training.day2;

import java.util.Scanner;

public class Circle2 {
    public static void main(String[] args) {
        double radius;
        double area;
        final double PI = 22.0 / 7;
        /* code to read the data from console*/
        System.out.println("enter the value for radius");

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("plz enter the positive radius");
            radius = sc.nextDouble();
        }while(radius<0);
        System.out.println("the area is "+PI*radius*radius);

            }

        }


