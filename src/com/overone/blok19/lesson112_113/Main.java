package com.overone.blok19.lesson112_113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line1 = reader1.readLine();
        try {
            int num = Integer.parseInt(line);
            int num1 = Integer.parseInt(line1);
            System.out.println(num + num1);
        } catch (NumberFormatException e) {
            System.out.println("You enter is not number");
        }

    }

}
