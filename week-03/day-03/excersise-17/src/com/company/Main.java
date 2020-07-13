package com.company;

public class Main {

    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 15;
        System.out.println(sum(firstNumber, secondNumber));

    }

    public static int sum(int a, int b) {
        int sumNumber = 0;
        for (a = 0; a <= b; a++) {
            sumNumber += a;
        }
        return (sumNumber);
    }

}
