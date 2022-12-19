package com.overone.blok20.lesson140;

import java.util.concurrent.Semaphore;
public class MainTaskThree {
    private static int books = 100;
    public static int getBooks() {
        return books;
    }
    public static void setBooks(int books) {
        MainTaskThree.books = books;
    }
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(7);

        for (int i = 0; i < 60; i++) {

            Reader task = new Reader(semaphore, i);

            task.start();

        }

    }
    public static int increment() {
        int res = books + 3;
        setBooks(res);
        return res;
    }
    public static int decrement() {
        int res = books - 3;
        setBooks(res);
        return res;
    }
}
