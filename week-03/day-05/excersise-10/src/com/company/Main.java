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

        //How much did we spent?
        int allCosts = 0;
        for (int cost : finance) {
            allCosts += cost;
        }
        System.out.println("We spent " + allCosts);

        //Which was our greatest expense?

        int greatestExpense = 0;

        for (int price : finance) {
            if (greatestExpense < price) {
                greatestExpense = price;
            }
        }

        System.out.println("Our greatest expense was " + greatestExpense);

        //Which was our cheapest spending?

        int cheapestExpense = 0;

        for (int price : finance) {
            if (greatestExpense > price) {
                cheapestExpense = price;
            }
        }

        System.out.println("Our cheapest spending was " + cheapestExpense);

        //What was the average amount of our spendings?

        int allPrices = 0;

        for (int price : finance) {
            allPrices += price;
        }

        int averageAmount = allPrices / finance.size();

        System.out.println("The average amount of our spendings was " + averageAmount);

    }
}
