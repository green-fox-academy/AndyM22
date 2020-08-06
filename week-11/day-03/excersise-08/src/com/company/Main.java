package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Write a Stream Expression to concatenate a Character list to a string!

        List<Character> characters = Arrays.asList('S', 'u', 'p', 'e', 'r');
        String string = characters.stream()
                .map(c -> c.toString())
                .collect(Collectors.joining());

        System.out.println(string);

    }
}
