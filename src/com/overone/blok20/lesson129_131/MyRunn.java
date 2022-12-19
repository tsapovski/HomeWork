package com.overone.blok20.lesson129_131;

public class MyRunn implements Runnable {
    @Override
    public void run() {
        Main main = new Main();
               int temp = main.getValue();

        for (int j = 1; j <= 10; j++) {

            temp --;

            Main.setValue(temp);
        }

    }
}
