package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("bread");
        shoppingList.add("chicken");

        if (shoppingList.contains("milk")) {
            System.out.println("Yes, we have milk on the list");
        } else {
            System.out.println("No, we don't have milk on the list");
        }

        if (shoppingList.contains("bananas")) {
            System.out.println("Yes, we have bananas on the list");
        } else {
            System.out.println("No, we don't have bananas on the list");
        }

    }
    
}
