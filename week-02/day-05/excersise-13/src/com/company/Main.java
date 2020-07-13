package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write distance in miles using double number: ");
        double userInput1 = scanner.nextDouble();
        double numberInKilometers = (userInput1 * 1.609344);
        System.out.println("Result is: " + numberInKilometers + "km");

    }
}
