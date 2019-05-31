package com.trimindtech.training.day4;

public class Fruitrunner {
    public static void main(String[] args) {


        Fruit orange = new Orange();
        Fruit apple = new Apple();
        Fruitrunner f1=new Fruitrunner();
        f1.makingJuice(orange);
        f1.makingJuice(apple);
    }
    public void makingJuice(Fruit fruit){
        /*fruit.makeJuice();
        fruit.peel();*/
         if((fruit instanceof Apple)){
            Apple a1=(Apple)new Apple();
            a1.removeSeeds();

        }else{
             fruit.peel();

         }
        fruit.makeJuice();
    }
}
