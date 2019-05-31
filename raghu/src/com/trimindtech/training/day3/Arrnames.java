package com.trimindtech.training.day3;

public class Arrnames {

    public static void printStringName(String[]names){

        for(String s :  names){
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        String[]arr={"raghu","ram","raj"};
        printStringName(arr);
    }
}
