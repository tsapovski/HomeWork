package com.overone.blok20Threads.lesson40;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static String str;

    public static void main(String[] args) {

        ReentrantLock locker = new ReentrantLock();
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        Thread thread1 = new ReplaceThreadO("firstThread", locker);
        Thread thread2 = new ReplaceThreadN("SecondThread", locker);

        thread1.start();

        thread2.start();

    }

    public static String getStr() {
        return str;
    }

}
