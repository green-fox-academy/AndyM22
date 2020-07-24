package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();

        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<>();

        //Create a new list ('List B') with the values of List A
        listB.addAll(listA);

        //Print out whether List A contains Durian or not
        System.out.println("ListA contains Durian: " + listA.contains("Durian"));

        //Remove Durian from List B
        listB.remove("Durian");

        //Add Kiwifruit to List A after the 4th element
        listA.add(4, "Kiwifruit");

        //Compare the size of List A and List B
        System.out.println("ListA is the same size as listB: " + listA.equals(listB));

        //Get the index of Avocado from List A
        System.out.println("Index of Avocado: " + listA.indexOf("Avocado"));

        //Get the index of Durian from List B
        System.out.println("Index of Durian is: " + listB.indexOf("Durian"));

        //Add Passion Fruit and Pomelo to List B in a single statement ??
        listB.add("Passion fruit");
        listB.add("Pomelo");

        //Print out the 3rd element from List A
        System.out.println(listA.get(2));

    }

}
