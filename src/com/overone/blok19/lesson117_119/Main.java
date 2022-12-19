package com.overone.blok19.lesson117_119;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Files.createFile(Path.of("test.txt"));
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();

        FileWriter fileWriter = new FileWriter("test.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        int length = 5;

       if (str.length()>length){
           printWriter.print(str);
       } else if (str1.length()>length) {
           printWriter.print(str1);
       } else if (str2.length()>length) {
           printWriter.print(str2);
       }
        printWriter.close();
    }
}
