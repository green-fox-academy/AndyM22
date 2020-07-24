package com.company;

public abstract class RandomNumber {

    public static int getRandomNumber() {
        int min = 1;
        int max = 5;
        return (int) (Math.random() * (max - min + 1) + min);
    }

}
