package com.company;

public class Main {

    public static void main(String[] args) {

        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


       //For loop

        char [] newArray = toBeReversed.toCharArray();

        for (int i = newArray.length-1; i>=0; i--)
            System.out.print(newArray[i]);



    }
}
