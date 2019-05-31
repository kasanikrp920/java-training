package com.trimindtech.training.homework03;

public class Planet {
    private String name;
    private int travelDays;
 /*  {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the planet name...");
        this.name=sc.nextLine();
        System.out.println("enter the travel days..");
        this.travelDays=sc.nextInt();

    }*/
    public void printPlanet(){
        System.out.println("planet name: "+name);
        System.out.println("Travel Days: "+travelDays);
    }
    public void calculateAge(int age){
        double ageOnThePlanet=(age*365)/travelDays;
        System.out.println("person age on planet is "+ageOnThePlanet);

    }
   /* public Planet(){
        this.name="earth";
        this.travelDays=365;
    }*/
   public Planet(String name,int travelDays){
       this.name=name;
       this.travelDays=travelDays;
   }

}
