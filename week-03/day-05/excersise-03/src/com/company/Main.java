package com.company;

public class Main {

    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String [] arrayOfString = quote.split(": ");

        String beforeString = arrayOfString[0];

        String afterString = arrayOfString[1];

        String newPart = ": always takes longer than ";

        String newString = beforeString + newPart + afterString;

        quote = newString;

        System.out.print(quote);

    }
}
