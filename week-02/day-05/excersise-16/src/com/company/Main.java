package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scanner = new Scanner(System.in);

        System.out.println("Write number of girls: ");
        int numberOfGirls = scanner.nextInt();

        System.out.println("Write number of boys: ");
        int numberOfBoys = scanner.nextInt();

        if ((numberOfGirls == numberOfBoys) && ((numberOfGirls + numberOfBoys) >= 20)) {
            System.out.println("The party is excellent!");
        } else if (numberOfGirls <= 0) {
            System.out.println("Sausage party");
        } else if ((numberOfGirls + numberOfBoys) < 20) {
            System.out.println("Average party...");
        } else if  ((numberOfGirls + numberOfBoys) >= 20) {
            System.out.println("Quite cool party!");
        } else {
            System.out.println("No other option left");
        }

    }
}
