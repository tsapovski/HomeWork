package com.overone.blok20Threads.lesson132;

public class SecondThread implements Runnable{

    @Override
    public void run() {
        Main main = new Main();
        int temp = main.getValue();

        for (int j = 1; j <= 5; j++) {

            temp --;

            Main.setValue(temp);
        }
    }
}
