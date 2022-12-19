package com.overone.blok20.lesson134;


import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter counter number");
        count = scanner.nextInt();
        CountDownLatch downLatch = new CountDownLatch(count);
        new MyThread(downLatch).start();

        try {
            downLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println((double) MyThread.res / 2);

    }
}
