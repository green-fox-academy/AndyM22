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

        System.out.println("The products below price 201 are: " + productBelowPrice(productDatabase, 201));
        System.out.println("The products over price 150 are: " + productOverPrice(productDatabase, 150));

    }

    public static ArrayList<String> productBelowPrice(HashMap<String, Integer> hashMap, int price) {
        ArrayList<String> products = new ArrayList<>();

        for (Map.Entry<String, Integer> string : hashMap.entrySet()) {
            int number = string.getValue();
            String name = string.getKey();
            if (number < price) {
                products.add(name);
            }
        }
        return products;
    }

    public static ArrayList<String> productOverPrice(HashMap<String, Integer> hashMap, int price) {
        ArrayList<String> products = new ArrayList<>();

        for (Map.Entry<String, Integer> string : hashMap.entrySet()) {
            int number = string.getValue();
            String name = string.getKey();
            if (number > price) {
                products.add(name);
            }
        }
        return products;
    }
    
}
