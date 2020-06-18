package com.company;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"


        try {
            Path filePath = Paths.get("my-file.txt");
            for (String line : Files.readAllLines(filePath)) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println("Unable to read file: my-file.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
