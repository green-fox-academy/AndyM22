package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your number: ");
        int usersInput1 = scanner.nextInt();

        if (usersInput1 <= 0) {
            System.out.println("Not enough");
        } else if (usersInput1 == 1) {
            System.out.println("One");
        } else if (usersInput1 == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }

    }
}
