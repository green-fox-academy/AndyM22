package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> mapOfIntroduction = new HashMap<>();

        mapOfIntroduction.put(97, "a");
        mapOfIntroduction.put(98, "b");
        mapOfIntroduction.put(99, "c");
        mapOfIntroduction.put(65, "A");
        mapOfIntroduction.put(66, "B");
        mapOfIntroduction.put(67, "C");

        //Vytiskni seznam všech klíčů
        System.out.println(mapOfIntroduction.keySet());

        //Vytiskni seznam hodnot
        System.out.println(mapOfIntroduction.values());

        //Add value D with the key 68
        mapOfIntroduction.put(68, "D");

        //Remove the key-value pair where with key 97
        mapOfIntroduction.remove(97);

        //Print whether there is an associated value with key 100 or not
        System.out.println(mapOfIntroduction.containsKey(100));

        System.out.println(mapOfIntroduction.entrySet());

        //Remove all the key-value pairs
        mapOfIntroduction.clear();

        System.out.println(mapOfIntroduction.size());

    }
}

