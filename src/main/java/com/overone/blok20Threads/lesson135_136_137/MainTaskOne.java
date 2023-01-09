package com.overone.blok20Threads.lesson135_136_137;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTaskOne {
    public static void main(String[] args) {
        CountDownLatch downLatch1 = new CountDownLatch(10);
        CountDownLatch downLatch2 = new CountDownLatch(10);
        CountDownLatch downLatch3 = new CountDownLatch(10);
        CountDownLatch downLatch4 = new CountDownLatch(10);
        CountDownLatch downLatch5 = new CountDownLatch(10);
        CountDownLatch downLatch6 = new CountDownLatch(10);

        ExecutorService service = Executors.newFixedThreadPool(3);

        service.execute(new TaskOne(downLatch1,"One"));
        service.execute(new TaskOne(downLatch2, "Two"));
        service.execute(new TaskOne(downLatch3, "Three"));
        service.execute(new TaskOne(downLatch4,"Fore"));
        service.execute(new TaskOne(downLatch5, "Five"));
        service.execute(new TaskOne(downLatch6, "Six"));


        try {
            downLatch1.await();
            downLatch2.await();
            downLatch3.await();
            downLatch4.await();
            downLatch5.await();
            downLatch6.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();
    }
}
