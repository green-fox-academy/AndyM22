package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        decrypting("duplicated-chars.txt");

    }

    public static String decrypting(String fileName) {
        Path path = Paths.get(fileName);
        List<String> lines = new ArrayList<>();
        try {

            for (String line : Files.readAllLines(path)) {
                lines.add(line);
            }

            for (int i = 0; i < lines.size(); i++) {
                String string = (lines.get(i) + " ");
                for (int j = 0; j < string.length(); j++) {
                    if (j % 2 == 0) {
                        char character = string.charAt(j);
                        System.out.print(character);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileName;
    }

}



