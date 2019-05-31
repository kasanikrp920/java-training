package com.trimindtech.training.day2;

import java.util.Scanner;

public class TwoDimArr {
    public static void main(String[] args) {
        /*int[][]rs=new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements into the array");
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<3;j++){
                rs[i][j]=sc.nextInt();
            }
        }*/
        int[][]rs={{1,2,3},{3,2,1},{1,2,3}};
        System.out.println("the elements in the array is");
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<3;j++){
                System.out.print(rs[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
