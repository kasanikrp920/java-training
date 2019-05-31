package com.trimindtech.training.day3;

public class BookRunner{
    public static void main(String[] args) {
        Book java = new Book("raghu",20.0,20,10,"TTS");
      /*  java.author = "raghu";
        java.cost = 20.0;
        java.edition = 10;
        java.publisher = "TTS ";
       *//* System.out.println(java.author);
        System.out.println(java.cost);
        System.out.println(java.edition);
        System.out.println(java.publisher);*//*
        System.out.println(" ");*/
        printBookDetails(java);


        /*Book cpp = new Book();
        cpp.author = "kashi sir";
        cpp.cost = 30.0;
        cpp.edition = 9;
        cpp.publisher = "TTS";
        printBookDetails(cpp);

       *//*System.out.println(cpp.author);
        System.out.println(cpp.cost);
        System.out.println(cpp.edition);
        System.out.println(cpp.publisher);*//*


        Book html = new Book();
        html.author = "raj";
        html.cost = 40.0;
        html.edition = 8;
        html.publisher = "xxx";
        printBookDetails(html);
*/
    }
        public static void printBookDetails(Book book){
            System.out.println(book.author);
            System.out.println(book.cost);
            System.out.println(book.noOfPages);
            System.out.println(book.edition);
            System.out.println(book.publisher);
        }


}
