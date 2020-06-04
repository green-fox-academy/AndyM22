package com.company;

public class Main {

    public static void main(String[] args) {

        String typo = "Chinchill";
        String result = appendAFunc(typo);
        System.out.println(result);
    }

    public static String appendAFunc(String character) {
        return (character + "a");
    }
}
