package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful


        copyFiles();


    }

    public static String copyFiles(String oldFile, String newFile) {
        try {
            Path filePath = Paths.get(oldFile);
            Path newFilePath = Paths.get(newFile);
            List<String> newLines = new ArrayList<>();
            for (String line : Files.readAllLines(filePath)) {
                newLines.add(line);
                Files.write(newFilePath, newLines);
            }
        } catch (Exception e) {
            System.out.println("");
        } finally {
            File file = new File(newFile);
            File copiedFile = new File(oldFile);
            if (file.length() == copiedFile.length()) {
                System.out.println("The file is empty");
            } else {
                System.out.println("The file was copied");
            }
        }
        return newFile;
    }


}
