package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingSeconds = ((60 * 60 * 24) - (currentSeconds + (currentMinutes * 60) + (currentHours * 60 * 60)));
        System.out.println(remainingSeconds);


    }
}
