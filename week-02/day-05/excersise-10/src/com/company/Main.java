package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean result = (f1 > f2);
        System.out.println(result);

        int g1 = 350;
        int g2 = 200;
        boolean resultg = ((g2 * 2) > g1);
        System.out.println(resultg);

        int h = 135798745;
        int h0 = 0;
        boolean resultOfH = ((h % 11) == 0);
        System.out.println(resultOfH);

        int i1 = 10;
        int i2 = 3;
        boolean resultI = ((i1 > (i2 * i2)) && (i1 < i2 * i2 * i2));
        System.out.println(resultI);

        int j = 1521;
        boolean resultJ = ((j % 3) == 0) || ((j % 5) == 0);
        System.out.println(resultJ);

    }
}
