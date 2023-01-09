package com.overone.blok20Threads.lesson135_136_137;

import java.util.concurrent.CountDownLatch;

public class TaskTwo extends Thread {

    String name;
    CountDownLatch countDown;

    TaskTwo(CountDownLatch c, String n) {
        countDown = c;
        name = n;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(name + ":=" + i);
            countDown.countDown();
        }
    }
}
