package com.trimindtech.training.day2;

import java.util.Scanner;

public class AvgArr {
    public static void main(String[] args) {
       double sum=0.0,avg=0.0;
       int count=0,a=0,b=0;
        int[]score=new int[10];
        System.out.println("enter the elemets that u want...");
        System.out.println("if u enter -1 the system doesn't  take elements");
        Scanner s= new Scanner(System.in);
        for(int i=0;i<score.length;i++)
        {
            score[i]=s.nextInt();//taking array elements
            if(score[i]==-1){
                break;
            }
            count++;
            sum=sum+score[i];// to find sum

        }
        System.out.println(sum);
        //System.out.println(count);
        avg=sum/count;
        System.out.println("average of given elements is  "+avg);
        for(int j=0;j<count;j++){
            if(score[j]>avg){
                a++;
            }else{
                b++;
            }
        }
        System.out.println("the no of elements greater than "+avg+"is  "+a);
        System.out.println("the no of elements less than "+avg+"is  "+b);


    }
}
