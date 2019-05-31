package com.trimindtech.training.day2;

public class SumArray {
    public static void main(String[] args) {
        int[]values={1,2,3,4,5};
        int sum=0;
        for(int j=0;j<values.length;j++){
            sum=sum+values[j];
        }
        System.out.println(sum);
    }
}
