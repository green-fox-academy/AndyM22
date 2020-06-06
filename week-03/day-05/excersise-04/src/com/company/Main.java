package com.company;

public class Main {

    public static void main(String[] args) {

        String todoText = " - Buy milk\n";

        String beforeString = "My todo:\n";

        todoText = beforeString.concat(todoText);

        String games = " - Download games\n";

        String diablo = "       - Diablo\n";

        todoText = todoText.concat(games);

        todoText = todoText.concat(diablo);

        System.out.print(todoText);


    }
}
