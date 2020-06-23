package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(countingBunnyEars(10));

    }

    public static int countingBunnyEars(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 2 + countingBunnyEars(n - 1);
        }
    }

}
