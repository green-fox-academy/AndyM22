package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(removeX("Extra"));

    }

    public static String removeX(String s) {
        if (s.length() == 0) {
            return "";
        } else if (s.charAt(0) == 'x') {
            return removeX(s.substring(1));
        } else {
            return s.charAt(0) + removeX(s.substring(1));
        }
    }


}
