package com.trimindtech.training.homework03;

public class Household {
    private int numOfOccupants;
    private double annualIncome;

    public void setNumOfOccupants(int numOfOccupants) {
        System.out.println("values have been modified....");
        this.numOfOccupants = numOfOccupants;
        System.out.println("num of Occupants =  "+this.numOfOccupants);
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
        System.out.println("annual income = "+this.annualIncome);
    }

    /*public Household(){
        System.out.println("HOUSEHOLD....");
        System.out.println("number of occupants..."+numOfOccupants);
        System.out.println("annual income..."+annualIncome);
    }a*/
   /* public Household(){
        this.numOfOccupants=1;
        this.annualIncome=0;
        System.out.println("HOUSEHOLD....");
        System.out.println("number of occupants..."+numOfOccupants);
        System.out.println("annual income..."+annualIncome);
    }b*/
   /* public Household(int x){
        this.numOfOccupants=x;
        System.out.println("number of occupants..."+this.numOfOccupants);

    }*/
    /*public Household(int x,double y){
        this.numOfOccupants=x;
        this.annualIncome=y;
        System.out.println("number of occupants..."+this.numOfOccupants);
        System.out.println("annual income..."+this.annualIncome);
    }*/
    public void calAverageIncome(int occupants,double annualIncome)
    {
        double averageIncome=annualIncome/occupants;
        System.out.println("ur average income is "+averageIncome);
    }



}
