package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Write your second number: ");
        int secondNumber = scanner.nextInt();

        if (secondNumber <= firstNumber) {
            System.out.println("The second number should be bigger");
        } else {
            for (int a = firstNumber + 1; a < secondNumber; a++) {
                System.out.println(a);
            }
        }

    }
}
