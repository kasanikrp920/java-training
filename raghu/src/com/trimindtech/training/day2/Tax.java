package com.trimindtech.training.day2;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        double amnt = 0.0;
        System.out.println("enter filing status");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str == "single") {
            double sal = 0.0;
            System.out.println("enter ur salary");
            sal = sc.nextDouble();
            if (sal >= 6000) {
                amnt = (sal * 10) / 100;
                System.out.println(amnt);
            } else if ((sal > 6000) && (sal <= 27950)) {
                amnt = (sal * 15) / 100;
                System.out.println(amnt);
            }else if ((sal > 27950) && (sal <= 67700)) {
                amnt = (sal * 27) / 100;
                System.out.println(amnt);
            }else if ((sal > 67700) && (sal <= 141250)) {
                amnt = (sal * 30) / 100;
                System.out.println(amnt);
            }else if ((sal > 141250) && (sal <= 307050)) {
                amnt = (sal * 35) / 100;
                System.out.println(amnt);
            }else  {
                amnt = (sal * 38.6) / 100;
                System.out.println(amnt);
            }
        }
    }

}
