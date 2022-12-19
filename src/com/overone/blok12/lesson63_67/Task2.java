package com.overone.blok12.lesson63_67;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        scanner.close();
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
                set.add(String.valueOf(str.charAt(i)));
        }
        for (String i: set) {
            System.out.println(i);
        }

    }
}
