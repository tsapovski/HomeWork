package com.overone.blok20Threads.lesson135_136_137;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTaskTwo {
    public static void main(String[] args) {
        CountDownLatch downLatch1 = new CountDownLatch(10);
        CountDownLatch downLatch2 = new CountDownLatch(10);
        CountDownLatch downLatch3 = new CountDownLatch(10);
        CountDownLatch downLatch4 = new CountDownLatch(10);
        CountDownLatch downLatch5 = new CountDownLatch(10);
        CountDownLatch downLatch6 = new CountDownLatch(10);
        CountDownLatch downLatch7 = new CountDownLatch(10);
        CountDownLatch downLatch8 = new CountDownLatch(10);
        CountDownLatch downLatch9 = new CountDownLatch(10);
        CountDownLatch downLatch10 = new CountDownLatch(10);
        ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(new TaskTwo(downLatch1, "One"));
        service.execute(new TaskTwo(downLatch2, "Two"));
        service.execute(new TaskTwo(downLatch3, "Three"));
        service.execute(new TaskTwo(downLatch4, "Fore"));
        service.execute(new TaskTwo(downLatch5, "Five"));
        service.execute(new TaskTwo(downLatch6, "Six"));
        service.execute(new TaskTwo(downLatch7, "Seven"));
        service.execute(new TaskTwo(downLatch8, "Eight"));
        service.execute(new TaskTwo(downLatch9, "Nine"));
        service.execute(new TaskTwo(downLatch10, "Ten"));

        try {
            downLatch1.await();
            downLatch2.await();
            downLatch3.await();
            downLatch4.await();
            downLatch5.await();
            downLatch7.await();
            downLatch8.await();
            downLatch9.await();
            downLatch10.await();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();
    }
}
