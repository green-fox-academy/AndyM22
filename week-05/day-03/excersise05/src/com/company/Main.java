package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        

        addNewLine("name");

    }

    public static String addNewLine(String name) {
        try {
            List<String> newLines = new ArrayList<>();
            newLines.add(name);
            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath, newLines);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
        return name;
    }


}
