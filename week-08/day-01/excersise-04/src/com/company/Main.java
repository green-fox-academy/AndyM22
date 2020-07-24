package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String string = "Ahoj, jakpak se dneska jenom máš?";
        System.out.println(string.length());
        System.out.println(dictionary(string));


    }

    public static HashMap<Character, Integer> dictionary(String string) {
        HashMap<Character, Integer> dictionary = new HashMap<>();

        dictionary.put(string.charAt(0), 1);
        int currentCount = 0;

        for (int i = 1; i < string.length(); i++) {
            char character = string.charAt(i);
            if (dictionary.containsKey(character)) {
                currentCount = dictionary.get(character);
                dictionary.put(character, currentCount + 1);
            } else {
                dictionary.put(character, 1);
            }
        }
        return dictionary;
    }

}
