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

        listB.addAll(listA);

        if (listA.contains("Durian")) {
            System.out.println("listA contains Durian");
        } else {
            System.out.println("listA does not containt Durian");
        }

        listB.remove("Durian");

        listA.add(4, "Kiwifruit");

        System.out.println("Size of listA is same as size of listB = " + listB.equals(listA));

        System.out.println("Index of Avocado is: " + listA.indexOf("Avocado"));

        System.out.println("Index of Durian is: " + listB.indexOf("Durian"));

        if ((listB.contains("Passion fruit")) != true) {
            listB.add("Passion fruit");
            listB.add("Pomelo");
        }

        System.out.println(listA.get(2));

    }


}
