package com.trimindtech.training.homework04;

import java.util.Scanner;

public class DVDMovies {
    public String movietitle;
    public double lengthOfMovie;
    public boolean status;

    public DVDMovies() {
        Scanner q = new Scanner(System.in);
        System.out.println("enter movie name..");
        movietitle = q.nextLine();
        System.out.println("enter movie length...");
        lengthOfMovie = q.nextDouble();
    }

    @Override
    public String toString() {
        return
                "movietitle = " + movietitle +
                        " lengthOfMovie = " + lengthOfMovie
                ;
    }


   /* public boolean isStatus(DVDMovies D,String movieName) {
        for (DVDMovies D : d) {
            System.out.println(D.toString());
        }

        return status;
    }*/

    public static void main(String[] args) {
        DVDMovies[]d = new DVDMovies[3];
        d[0] = new DVDMovies();
        d[1] = new DVDMovies();
        d[2] = new DVDMovies();

        for (DVDMovies D : d) {
            System.out.println(D.toString());
        }
        // d.insertMovie();
        System.out.println(d);


    }
}
