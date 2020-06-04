package com.company;

public class Main {

    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 15;
        int result = sum(firstNumber, secondNumber);
        System.out.println(result);

    }

    public static int sum(int a, int b) {
        int sumNumber = 0;
        for (a = 0; a <= b; a++) {
            sumNumber = sumNumber + a;
        }
        return (sumNumber);
    }


}
