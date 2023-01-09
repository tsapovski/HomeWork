package com.overone.blok20Threads.lesson134;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {
    CountDownLatch countDown;
    public static int res;

    MyThread(CountDownLatch c) {
        countDown = c;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        for (int i = 0; i < Main.count; i++) {
            res = scanner.nextInt();
            countDown.countDown();
        }

    }

}
