package com.trimindtech.training.homework04;

import java.util.Scanner;

public class Bakery {
    private String flavour;
    private int weight;
    private int quantity;
    private double totalPrice;
    private double unitPrice;
  static  {
        System.out.println("welcome to micky cake house");
        System.out.println("flavours......");
        System.out.println("1.Choclate moist.\n2.strawberry.\n3.blueberry.\n4.cheesy cake.\n5.american choclate");
        System.out.println("price per 1kg = rs.25");


    }
    public Bakery(String flavour, int weight, int quantity) {
        this.flavour = flavour;
        this.weight = weight;
        this.quantity = quantity;
    }
    public Bakery() {
        this("",0,0);
        this.flavour = "choclate moist";
        this.weight = 1;
        this.quantity = 1;

    }

       /* public String getFlavour () {
            return flavour;
        }

        public void setFlavour (String flavour){
            this.flavour = flavour;
        }

        public int getWeight () {
            return weight;
        }

        public void setWeight ( int weight){
            this.weight = weight;
        }

        public int getQuantity () {
            return quantity;
        }

        public void setQuantity ( int quantity){
            this.quantity = quantity;
        }

*/    @Override

    public String toString() {
        return "Bakery{" +
                "flavour='" + flavour + '\'' +
                ", weight=" + weight +
                ", quantity=" + quantity +",unitPrice="+unitPrice+",totalPrice="+totalPrice+
                '}';
    }
    public void getOrder(){
        System.out.println("enter the choice of cake flavour(1-5)");
        int ch=0;
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        switch(ch){
            case 1:this.flavour="Choclate moist.";

                break;
            case 2:this.flavour="strawberry";

                break;
            case 3:this.flavour="blue berry";

                break;
            case 4:this.flavour="cheesy cake";

                break;
            case 5:this.flavour="american choclate";

                break;
            default:
                System.out.println("enter the valid choice");
        }
        System.out.println("enter the weight of cake in kg..");
        this.weight=sc.nextInt();
        System.out.println("enter the quantity ordered..");
        this.quantity=sc.nextInt();
        this.unitPrice=this.weight*25;
        this.totalPrice=this.quantity*this.unitPrice;
    }


    }
