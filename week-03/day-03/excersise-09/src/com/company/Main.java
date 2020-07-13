package com.company;

public class Main {

    public static void main(String[] args) {

        String[][] colors = {
                {"green: ", "lime", "forest green", "olive", "pale green", "spring green"},
                {"red: ", "orange red", "red", "tomato"},
                {"pink: ", "orchid", "violet", "pink", "hot pink"}
        };

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.println(colors[i][j]);
            }
            System.out.println();
        }

    }
}
