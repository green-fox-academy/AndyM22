package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> mapOfIntroduction = new HashMap<>();

        System.out.println(mapOfIntroduction);

        mapOfIntroduction.put(97, "a");
        mapOfIntroduction.put(98, "b");
        mapOfIntroduction.put(99, "c");
        mapOfIntroduction.put(65, "A");
        mapOfIntroduction.put(66, "B");
        mapOfIntroduction.put(67, "C");

        for (Integer i : mapOfIntroduction.keySet()) {
            System.out.println(i);
        }

        for (String i : mapOfIntroduction.values()) {
            System.out.println(i);
        }

        mapOfIntroduction.put(68, "D");

        System.out.println(mapOfIntroduction.size());

        System.out.println(mapOfIntroduction.get(99));

        mapOfIntroduction.remove(97);

        if (mapOfIntroduction.containsKey(100)) {
            System.out.println("HashMap contains key 100");
        } else {
            System.out.println("HashMap does not contain key 100");
        }

        mapOfIntroduction.clear();

        System.out.println(mapOfIntroduction);
    }

}

