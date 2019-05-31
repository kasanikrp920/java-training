package com.trimindtech.training.day2;

import java.util.Scanner;

public class LargeNoArr {
    public static void largest() {
        int[]arr=new int[4];
        System.out.println("enter the elements in an array...");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("the largest no in given array   "+max);


    }

    public static void main(String[] args) {
        largest();

    }
}
