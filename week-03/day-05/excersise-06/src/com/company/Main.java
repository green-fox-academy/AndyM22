package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> introduction = new ArrayList<>();

        System.out.printf("%d%n", introduction.size());

        introduction.add("William");

        if (introduction.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        introduction.add("John");
        introduction.add("Amanda");

        System.out.println(introduction.size());

        System.out.printf("%s%n", introduction.get(2));

        for (int i = 0; i < introduction.size(); i++) {
            System.out.println(introduction.get(i));
        }

        for (int i = 0; i < introduction.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, introduction.get(i));
        }

        introduction.remove(1);

        System.out.println(introduction.size());

        for (int i = introduction.size() - 1; i >= 0; i--) {
            System.out.println(introduction.get(i));
        }

        introduction.clear();

        if (introduction.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }


    }
}
