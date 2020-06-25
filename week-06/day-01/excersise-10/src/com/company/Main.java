package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(greatestCommonDeviser(200, 1000));

    }

    public static int greatestCommonDeviser(int numberOne, int numberTwo) {
        if (numberTwo == 0) {
            return numberOne;
        } else {
            return greatestCommonDeviser(numberTwo, numberOne % numberTwo);
        }
    }

}
