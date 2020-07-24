package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> productDatabase = new HashMap<>();

        productDatabase.put("Eggs", 200);
        productDatabase.put("Milk", 200);
        productDatabase.put("Fish", 400);
        productDatabase.put("Apples", 150);
        productDatabase.put("Bread", 50);
        productDatabase.put("Chicken", 550);

        System.out.println("Fish costs " + productDatabase.get("Fish") + " Kč");

        System.out.println("The most expensive product is " + theMostExpansiveProduct(productDatabase));

        System.out.println("The average price is " + averagePrice(productDatabase));

        System.out.println("The number of products below price 300 is: " + productsBelow300(productDatabase));

        System.out.println("The products we can buy for 125: " + buyFor(productDatabase, 125));

        System.out.println("The cheapest product we can buy is: " + theCheapestProduct(productDatabase));

    }

    public static int averagePrice(HashMap<String, Integer> hashMap) {
        int allPrices = 0;
        for (int price : hashMap.values()) {
            allPrices += price;
        }
        return allPrices / hashMap.size();
    }

    public static String theMostExpansiveProduct(HashMap<String, Integer> hashMap) {
        int biggestPrice = 0;
        String nameOfProduct = "";

        for (Map.Entry<String, Integer> string : hashMap.entrySet()) {
            int price = string.getValue();
            String name = string.getKey();
            if (price > biggestPrice) {
                biggestPrice = price;
                nameOfProduct = name;
            }
        }
        return nameOfProduct + " for " + biggestPrice;
    }

    public static int theBiggestPrice(HashMap<String, Integer> hashMap) {
        int biggestPrice = 0;
        for (int price : hashMap.values()) {
            if (price > biggestPrice) {
                biggestPrice = price;
            }
        }
        return biggestPrice;
    }

    public static String theCheapestProduct(HashMap<String, Integer> hashMap) {
        int smallestPrice = theBiggestPrice(hashMap);
        String nameOfProduct = "";

        for (Map.Entry<String, Integer> string : hashMap.entrySet()) {
            int price = string.getValue();
            String name = string.getKey();
            if (price < smallestPrice) {
                smallestPrice = price;
                nameOfProduct = name;
            }
        }
        return nameOfProduct + " for " + smallestPrice;
    }

    public static int productsBelow300(HashMap<String, Integer> hashMap) {
        int numberOfProducts = 0;
        for (int price : hashMap.values()) {
            if (price < 300) {
                numberOfProducts += 1;
            }
        }
        return numberOfProducts;
    }

    public static ArrayList<String> buyFor(HashMap<String, Integer> hashMap, int price) {
        ArrayList<String> products = new ArrayList<>();
        for (Map.Entry<String, Integer> string : hashMap.entrySet()) {
            int number = string.getValue();
            String name = string.getKey();
            if (number == price) {
                products.add(name);
            }
        }
        return products;
    }

}
