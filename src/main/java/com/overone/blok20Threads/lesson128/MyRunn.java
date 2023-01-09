package com.overone.blok20Threads.lesson128;

public class MyRunn implements Runnable {
    @Override
    public void run() {
        Main main = new Main();

        for (double j = main.getValue(); j <= 10; j++) {

            Main.setValue(j);

        }
    }
}
