package com.company;

public class Main {

    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 5;
        int result = factorio(firstNumber, secondNumber);
        System.out.println(result);

    }

    public static int factorio(int a, int b) {
        int factorialNumber = 1;
        for (a = 1; a <= b; a++) {
            factorialNumber = factorialNumber * a;
        }
        return (factorialNumber);
    }

}
