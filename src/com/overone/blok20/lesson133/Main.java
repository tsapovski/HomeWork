package com.overone.blok20.lesson133;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Semaphore semaphore = new Semaphore(3);

        new FirstThread("Car1",semaphore).start();
        new FirstThread("Car2",semaphore).start();
        new FirstThread("Car3",semaphore).start();
        new FirstThread("Car4",semaphore).start();
        new FirstThread("Car5",semaphore).start();
        new FirstThread("Car6",semaphore).start();
        new FirstThread("Car7",semaphore).start();
        new FirstThread("Car8",semaphore).start();
        new FirstThread("Car9",semaphore).start();
        new FirstThread("Car10",semaphore).start();


    }

}
