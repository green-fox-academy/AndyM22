package com.company;

public class Main {

    public static void main(String[] args) {

        int[] numList = new int[]{3, 4, 5, 6, 7};

        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * 2;
        }

        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }

    }
}
