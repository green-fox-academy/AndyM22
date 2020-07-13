package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userInput1 = scanner.nextLine();
        System.out.println("Hello, " + userInput1 + "!");

    }
}
