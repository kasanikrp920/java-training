package com.trimindtech.training.day4;

public class Manager extends Employee {
   private double bonus;
   /* public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }*/

   /* public Manager(  double bonus) {
        super( "raghu",20,5,23300);
        this.bonus = bonus;
    }*/

    public Manager(String name, int age, int experience, double salary, double bonus) {
        super(name, age, experience, salary);
        this.bonus = bonus;
    }

    /* public Manager(double bonus) {
                this.bonus = bonus;
            }*/
     public double getSalary(){
        return this.bonus+super.getSalary() ;
   }



}
