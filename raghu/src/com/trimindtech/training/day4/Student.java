package com.trimindtech.training.day4;

public class Student {
    public static  int I=1;
    public Student(){

        System.out.println("the object created whose no is.."+I);
        I++;
    }

    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student();

    }
}
