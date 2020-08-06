package com.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // Write a Stream Expression to find the uppercase characters in a string!

        String line = "FinDing AlL The UpperCase";

        IntStream intStream = line.chars(); //převede znaky do číselné reprezentace a uloží v instanci IntSTreamu
        intStream.filter(Character::isUpperCase) //ponechá pouze znaky (stále v číselné reprezentaci), které jsou velkými písmeny
                .mapToObj(c -> Character.toString((char) c)) //převede instanci do objektu String a převede číselnou reprezentaci znaku do characteru
                .forEach(c -> System.out.println(c));

    }
}
