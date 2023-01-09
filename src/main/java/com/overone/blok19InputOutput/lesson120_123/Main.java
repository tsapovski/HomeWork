package com.overone.blok19InputOutput.lesson120_123;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "";
        try {
            FileReader reader = new FileReader("test.txt");
            Scanner scanner = new Scanner(reader);
            text = scanner.nextLine();
            reader.close();
            scanner.close();

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        String newText = text.toLowerCase().replaceAll("\\s", "");
        long charText = newText.chars().filter(ch -> ch == 'a').count();

        try {
            FileWriter writer = new FileWriter("test.txt");
            String str = String.valueOf(charText);
            writer.write(str);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
