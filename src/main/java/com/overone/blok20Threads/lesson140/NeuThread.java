package com.overone.blok20Threads.lesson140;

public class NeuThread extends Thread {
    String name;

    NeuThread(String n) {
        name = n;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(name + "- Здесь должен быть символ");
        }
    }

}
