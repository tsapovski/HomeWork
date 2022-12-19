package com.overone.blok20.lesson133;


import java.util.concurrent.Semaphore;

public class FirstThread extends Thread{
    String name;
    Semaphore semaphore;
    private boolean full = false;

    public FirstThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;

    }
    @Override
    public  void run() {
        try {

            if (!full) {
                semaphore.acquire();
                System.out.println(name + " pulls into the parking lot");

                sleep(500);
                full = true;

                System.out.println(name + " leaves the parking lot");
                semaphore.release();
                sleep(500);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
