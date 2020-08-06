package com.company;

import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) {
        // Write a Stream Expression to find the frequency of characters in a given string!

        String string = "How are you today?";

        Map<Character, Integer> frequency = string.chars().boxed()
                .collect(toMap(
                        k -> Character.valueOf((char) k.intValue()),
                        v -> 1,
                        Integer::sum));

        System.out.println(frequency);


   /*     long numberOfOccurency = string.chars()
                .filter(c -> c == 'a')
                .count();

        System.out.println(numberOfOccurency);*/

    }
}
