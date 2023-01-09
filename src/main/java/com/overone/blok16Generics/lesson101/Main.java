package com.overone.blok16Generics.lesson101;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 5, 67, 45, 324, 3, 2, 3, 4, 3};

        Generic generic = new Generic();

        System.out.println(generic.sum(arr));
    }
}
