package com.trimindtech.training.homework03;

public class Rectangle {
    private static double length;
    private static double width;

    public static void setLength(double len) {


        length = len;
    }

    public static void setWidth(double wid) {
        width = wid;
        //System.out.println(width);
    }
    public static void area(){
        double result=(length*width);
        System.out.println("the area of rectangle  "+result);
    }
    public static void perimeter(){
        double result=2*(length+width);
        System.out.println("the perimeter of rectangle  "+result);
    }
}
