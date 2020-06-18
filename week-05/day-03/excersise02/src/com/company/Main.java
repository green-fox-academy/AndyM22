package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0


        devideByTen(0);

    }

    public static int devideByTen(int a) {
        try {
            int result = 10 / a;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Fail!");
        }
        return a;
    }

}
