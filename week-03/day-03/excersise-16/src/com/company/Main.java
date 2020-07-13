package com.company;

public class Main {

    public static void main(String[] args) {

        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));

    }

    public static String appendAFunc(String character) {
        return (character + "a");
    }
}
