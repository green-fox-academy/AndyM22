package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> telephoneBook = new HashMap<>();

        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println("John K. Miller's phone number is: " + telephoneBook.get("John K. Miller"));

        for (String string : telephoneBook.keySet()) {
            String name = string;
            String number = telephoneBook.get(string);
            if (number.equals("307-687-2982")) {
                System.out.println("The number " + number + " belongs to " + name);
            }
        }

        if (telephoneBook.containsKey("Chris E. Myer")) {
            System.out.println("Telephone Book contains Chris E. Myers' phone number");
        } else {
            System.out.println("Telephone Book does not contain Chris E. Myers' phone number");
        }

    }

}
