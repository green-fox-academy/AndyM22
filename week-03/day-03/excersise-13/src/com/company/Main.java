package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7};

        int numbersLength = numbers.length;
        int[] reversedNumbers = new int[numbersLength];

        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbersLength - 1];
            numbersLength -= 1;
        }
        numbers = Arrays.copyOf(reversedNumbers, reversedNumbers.length);
        System.out.println(Arrays.toString(numbers));

    }
}
