package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your number: ");
        int userInput1 = scanner.nextInt();

        if ((userInput1 % 2) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }




    }
}
