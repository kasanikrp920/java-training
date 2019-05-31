package com.trimindtech.training.day3;

public class Animal {
   /* public String toString(){
        return "trimindtech solutions";
    }*/

    public Animal(String name, String color, int livingSpan) {
        this.name = name;
        this.color = color;
        this.livingSpan = livingSpan;
    }

    private String name;
    private  String color;
    private int livingSpan;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

