package com.overone.blok12.lesson63_67;

import java.util.TreeSet;

public class Mnogestva {
    public static void main(String[] args) {
        TreeSet <String> ts = new TreeSet<>();
        ts.add("second");
        ts.add("fourth");
        ts.add("first");
        ts.add("third");
        ts.add("fourth");
        ts.add("five");
        ts.add("first");
        ts.add("six");
        ts.add("seven");
        ts.add("thirteen");
        ts.add("twenty");
        ts.add("eight");
        ts.add("eleven");
        ts.add("seventeen");
        ts.add("nine");
        ts.add("sixteen");
        ts.add("ten");
        ts.add("fifteen");
        ts.add("eighteen");
        ts.add("twelve");
        ts.add("nineteen");
        ts.add("fourteen");
        for (String value : ts) {
            System.out.println(value);
        }
    }
}
