package com.overone.blok20Threads.lesson140;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Reader extends Thread {
    final Random rand = new Random();
    Semaphore semaphore;
    int number;
    private boolean full = false;

    Reader(Semaphore s, int i) {
        semaphore = s;
        number = i;
    }

    @Override
    public synchronized void run() {

        try {

            if (!full) {

                semaphore.acquire();
                System.out.println(Reader.class.getSimpleName() + "-" + number + " берет книги");
                int decrementBok = MainTaskThree.decrement();
                MainTaskThree.setBooks(decrementBok);
                System.out.println(MainTaskThree.getBooks() + "книг осталось в библиотеке");
                sleep(rand.nextInt(3000));
                full = true;

                System.out.println(Reader.class.getSimpleName() + "-" + number + " сдал книги и ушел");
                int incrementBok = MainTaskThree.increment();
                MainTaskThree.setBooks(incrementBok);
                System.out.println(incrementBok + "книг осталось в библиотеке");
                semaphore.release();

                sleep(300);
            }

        } catch (InterruptedException e) {
            System.out.println("Читатель уснул");
        }

    }
}
