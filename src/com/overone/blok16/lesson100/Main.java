package com.overone.blok16.lesson100;

public class Main {
    public static void main(String[] args) {
        Generic<Object> stringGeneric = new Generic<>();
        String className = String.valueOf(stringGeneric.checkTheClass(stringGeneric));
        System.out.println("Class name - " + className);

    }
}
