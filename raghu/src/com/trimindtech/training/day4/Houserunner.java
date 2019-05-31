package com.trimindtech.training.day4;

public class Houserunner {
    public static void main(String[] args) {
        House h= new House();
        System.out.println(h.toString());
        h.setType("house");
        System.out.println( h.getType());
        h.setZone('B');
        System.out.println( h.getZone());
        h.setFreehold(true);
        System.out.println(h.isFreehold());
        h.setPrice(20000);
        System.out.println(h.getPrice());
        h.setNumberOfBedrooms(5);
        System.out.println(h.getNumberOfBedrooms());

        House[] obj=new House[3];
        obj[0]=new House("xxx",'a',20000,3,true);
        obj[1]=new House("yyy",'b',30000,5,true);
        obj[2]=new House("zzz",'c',40000,6,true);
        for(House house:obj) {
            System.out.println(house.toString());
        }
       /* System.out.println(obj[1].toString());
        System.out.println(obj[2].toString());*/



    }

}
