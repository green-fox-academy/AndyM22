package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(addNumber(10));

    }

    public static int addNumber(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + addNumber(n - 1);
        }
    }


}
