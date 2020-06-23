package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        rewriteX();

    }

    public static void rewriteX() {
        System.out.println("Enter words that contains character x: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if (s.contains("x")) {
            System.out.println(s.replace("x", "y"));
        } else {
            rewriteX();
        }
    }
}
