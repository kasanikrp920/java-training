package com.trimindtech.training.day3;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal cow= new Animal("cow","white",20);
        System.out.println(cow);
        cow.setColor("deep white");
        System.out.println(cow.getColor());
    }
}
