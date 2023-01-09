package com.overone.blok16Generics.lesson101;

public class Generic<T extends Number> {
    public int sum(T[] arr) {
        int summa = 0;

        for (T t : arr) {
            summa += t.doubleValue();
        }
        return summa;
    }
}


