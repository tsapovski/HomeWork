package com.overone.blok20.lesson128;

public class MyThread extends Thread {

    @Override
    public void run() {
        Main main = new Main();

        for (int j = 0; j < 5; j++) {
            double i = main.getValue();
            Main.setValue(i / 2);

        }

    }

}

