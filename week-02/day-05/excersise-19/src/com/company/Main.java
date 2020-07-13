package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your number: ");
        int usersNumber = scanner.nextInt();

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(multiplier + " * " + usersNumber + " = " + (multiplier * usersNumber));
        }

    }
}
