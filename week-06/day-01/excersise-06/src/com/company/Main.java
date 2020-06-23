package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(rewriteX("axaxax"));

    }

    public static String rewriteX(String s) {
        if (s.length() == 0) {
            return "";
        } else if (s.charAt(0) == 'x') {
            return s.replace(s.charAt(0), 'y');
        } else {
            return s.charAt(0) + rewriteX(s.substring(1));
        }
    }
}
