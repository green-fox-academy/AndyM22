package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Double> products = new HashMap<>();
        products.put("Milk", 1.07);
        products.put("Rice", 1.59);
        products.put("Eggs", 3.14);
        products.put("Cheese", 12.60);
        products.put("Chicken Breasts", 9.40);
        products.put("Apples", 2.31);
        products.put("Tomato", 2.58);
        products.put("Potato", 1.75);
        products.put("Onion", 1.10);

        HashMap<String, Integer> bob = new HashMap<>();

        bob.put("Milk", 3);
        bob.put("Rice", 2);
        bob.put("Eggs", 2);
        bob.put("Cheese", 1);
        bob.put("Chicken Breasts", 4);
        bob.put("Apples", 1);
        bob.put("Tomato", 2);
        bob.put("Potato", 1);

        HashMap<String, Integer> alice = new HashMap<>();

        alice.put("Rice", 1);
        alice.put("Eggs", 5);
        alice.put("Chicken Breasts", 2);
        alice.put("Apples", 1);
        alice.put("Tomato", 10);

        HashMap<String, HashMap> customers = new HashMap<>();

        customers.put("Bob", bob);
        customers.put("Alice", alice);

        System.out.println("Bob pays " + purchaseCost(products, bob));
        System.out.println("Alice pays " + purchaseCost(products, alice));
        System.out.println("The most Rice buys: " + whoBuyMore(customers, "Rice"));
        System.out.println("The most Potatoes buys: " + whoBuyMore(customers, "Potato"));


    }

    public static String whoBuyMore(HashMap<String, HashMap> customers, String product) {

        String nameOfCustomer = "";

        ArrayList<String> names = new ArrayList<>();

        for (String string : customers.keySet()) {
            names.add(string);
        }

        HashMap<String, Integer> customer1 = customers.get(names.get(0));
        HashMap<String, Integer> customer2 = customers.get(names.get(1));


        HashMap<String, Integer> customer = theMostBoughtProduct(customer1, customer2, product);

        if (customer.equals(customer1)) {
            nameOfCustomer = names.get(0);
        } else {
            nameOfCustomer = names.get(1);
        }
        return nameOfCustomer;
    }

    public static double purchaseCost(HashMap<String, Double> products, HashMap<String, Integer> shoppingList) {
        double finalPrice = 0;
        int runs = shoppingList.size();

        for (Map.Entry<String, Double> string : products.entrySet()) {
            Double price = string.getValue();
            String name = string.getKey();
            for (Map.Entry<String, Integer> line : shoppingList.entrySet()) {
                String nameFromList = line.getKey();
                int amount = line.getValue();
                if (name.equals(nameFromList)) {
                    double currentPrice = amount * price;
                    finalPrice += currentPrice;
                    runs -= 1;
                    break;
                }
            }
            if (runs == 0) {
                break;
            }
        }
        return finalPrice;
    }

    public static int numberOfPurchase(HashMap<String, Integer> shoppingList, String nameOfProduct) {
        int numberOfProducts = 0;

        for (Map.Entry<String, Integer> string : shoppingList.entrySet()) {
            String name = string.getKey();
            int amount = string.getValue();
            if (name.equals(nameOfProduct)) {
                numberOfProducts = amount;
            }
        }
        return numberOfProducts;
    }

    public static HashMap<String, Integer> theMostBoughtProduct(HashMap<String, Integer> shoppingList1, HashMap<String, Integer> shoppingList2, String nameOfProduct) {

        HashMap<String, Integer> whoBuysMore = new HashMap<>();

        int numberOfShoppingList1 = numberOfPurchase(shoppingList1, nameOfProduct);
        int numberOfShoppingList2 = numberOfPurchase(shoppingList2, nameOfProduct);

        if (numberOfShoppingList1 > numberOfShoppingList2) {
            whoBuysMore = shoppingList1;
        } else {
            whoBuysMore = shoppingList2;
        }
        return whoBuysMore;
    }

}
