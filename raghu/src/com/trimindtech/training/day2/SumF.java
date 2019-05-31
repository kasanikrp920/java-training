package com.trimindtech.training.day2;

public class SumF {
    public static void main(String[] args) {
        double sum=0.0;
        for(double i=0.01;i<=1.0;i=i+0.01){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
