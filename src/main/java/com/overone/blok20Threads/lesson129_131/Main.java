package com.overone.blok20Threads.lesson129_131;

import java.util.Scanner;

public class Main {

    private static int value = 0;

    public int getValue() {
        return value;
    }

    public static int setValue(int value) {
        Main.value = value;
        return value;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();

        MyRunn myRunn = new MyRunn();
        Thread threadRunn = new Thread(myRunn);
        threadRunn.start();
        threadRunn.join(1000);
        System.out.println(value + threadRunn.getName());

        testThread();
    }

    public static synchronized void testThread() {
        MyRunn myRunn = new MyRunn();
        Thread threadRunn = new Thread(myRunn);
        threadRunn.start();
        threadRunn.run();
        System.out.println(value + threadRunn.getName());

    }
}
