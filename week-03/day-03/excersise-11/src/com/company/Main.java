package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] orders = {"first", "second", "third"};

        String firstElement = orders[0];
        orders[0] = orders[2];
        orders[2] = firstElement;

        System.out.println(Arrays.toString(orders));

    }
}
