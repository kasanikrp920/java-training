package com.trimindtech.training.day2;

import java.util.Scanner;

public class Circle {
    public static void main(String[]args){
        double radius;
        double area;
       final double PI=22.0/7;
        /* code to read the data from console*/
        System.out.println("enter the value for radius");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextDouble();
        area = PI*radius*radius;
        System.out.println(area);

    }
}
