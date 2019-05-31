package com.trimindtech.training.homework04;

public class BackeryRunner {
    public static void main(String[] args) {
        Bakery b1=new Bakery();
        //System.out.println(b1.toString());
       b1.getOrder();
        Bakery b2=new Bakery();
        b2.getOrder();
        System.out.println( b1.toString());
        System.out.println(b2.toString());
    }
}
