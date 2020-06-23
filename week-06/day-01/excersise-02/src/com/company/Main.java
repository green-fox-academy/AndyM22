package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(1234));

    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumDigits(n / 10); //př. 1234: 1234%10 = 4; 4 + sumDigits(1234/10 = 123)// 123%10 = 3; 3 + sumDigits(123/10 = 12) // 12%10 = 2; 2 + sumDigits(12/10 = 1)// 1%10 = 1; 1 + sumDigits(1/10 = 0)//
        }                                         //                       4 + 6 = 10;                <-              3 + 3 = 6;                 <-            2 + 1 = 3;               <-          1 + 0 = 1;
    }
}
