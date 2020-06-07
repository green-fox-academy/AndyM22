package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> finance = new ArrayList<>();

        finance.add(500);
        finance.add(1000);
        finance.add(1250);
        finance.add(175);
        finance.add(800);
        finance.add(120);

        System.out.println("We spent " + (finance.get(0) + finance.get(1) + finance.get(2) + finance.get(3) + finance.get(4) + finance.get(5)) + " Kč");

        System.out.println("Our greatest expense was " + finance.get(2) + " Kč");

        System.out.println("Our cheapest spending was " + finance.get(5) + " Kč");

        System.out.println("The average amount of our spendings was " + ((finance.get(0) + finance.get(1) + finance.get(2) + finance.get(3) + finance.get(4) + finance.get(5))/5) + " Kč");


    }
}
