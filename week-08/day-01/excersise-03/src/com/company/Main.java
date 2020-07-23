package com.company;

public class Main {

    public static void main(String[] args) {

        //anagram("Ahoj", "hoja");
        //anagram("Ahoj", "Ha jo");
        //anagram("ahoj", "jahoda");
        anagram("jako ve vlastnim", "ne");

    }

    public static boolean anagram(String string1, String string2) {
        string1 = string1.toLowerCase().replaceAll(" ", "");
        string2 = string2.toLowerCase().replaceAll(" ", "");

        int numberOfCharacters = string1.length();

        for (int i = 0; i < string2.length(); i++) {
            char currentChar = string2.charAt(i);
            for (int j = 0; j < string1.length(); j++) {
                if (currentChar == string1.charAt(j)) {
                    numberOfCharacters -= 1;
                    break;
                }
            }
        }
        if (numberOfCharacters == 0) {
            return true;
        } else {
            return false;
        }
    }

}
