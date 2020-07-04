package com.company;

public class Main {

    public static void main(String[] args) {

        Gnirts gnirts = new Gnirts("Some sentence!");

        System.out.println(gnirts.charAt(13));
        System.out.println(gnirts.length());
        System.out.println(gnirts.subSequence(2, 6));

        Shifter shifter = new Shifter("Some sentence!", 2);

        System.out.println("\n" + shifter.charAt(11));
        System.out.println(shifter.length());
        System.out.println(shifter.subSequence(2, 6));

    }
}
