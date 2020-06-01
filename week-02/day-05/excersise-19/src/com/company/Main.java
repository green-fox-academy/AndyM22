package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your number: ");
        int usersNumber = scanner.nextInt();


        for (int multiplier = 1;  multiplier <=10; multiplier++) {
            System.out.println(multiplier + " * " + usersNumber + " = " + (multiplier * usersNumber));
        }


    }
}
