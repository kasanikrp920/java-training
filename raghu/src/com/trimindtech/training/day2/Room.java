package com.trimindtech.training.day2;

import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
        int length=15;
        int breadth=20;
      //  int area=length*breadth;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for length");
        length=sc.nextInt();
        System.out.println("enter the value for breadth");
        breadth=sc.nextInt();
        int area=length*breadth;
        System.out.println(area);
}
}
