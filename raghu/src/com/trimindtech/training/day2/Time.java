package com.trimindtech.training.day2;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int min;
       // float hr = min / 60;
       /// System.out.println("minutes"+min);
        Scanner sc= new Scanner(System.in);
        System.out.println("enter min");
        min=sc.nextInt();
        int hr=min/60;
        System.out.println("hours: "+hr);
        int minutes=min%60;
        System.out.println("minutes: "+minutes);

    }
}
