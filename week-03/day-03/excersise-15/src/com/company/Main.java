package com.company;

public class Main {

    public static void main(String[] args) {

        String al = "Green Fox";
        String greetings = greet(al);
        System.out.println(greetings);


    }

    public static String greet(String name) {
        return ("Greetings dear, " + name);
    }
}
