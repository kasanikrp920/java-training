package com.trimindtech.training.day4;

public class Irunner {
    public static void main(String[] args) {
      Manager m= new Manager("raghu",22,2,23000,2000);
        //Manager m= new Manager(20000);
        //m.setName("raghu");
        System.out.println(m.getName());
        /*m.setAge(22);
        m.setExperience(1);
        m.setSalary(25000);
        m.setBonus(2000);
        m.getSalary(25000);
       m.toString();*/
      //  m.setBonus(2000);
        //System.out.println(m.getSalary(25000));
        System.out.println( m.toString());
        m.setSalary(25000);
        System.out.println(m.getSalary());


    }
}
