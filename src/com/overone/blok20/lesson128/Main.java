package com.overone.blok20.lesson128;


public class Main {

    private static double value = 0;

    public double getValue() {
        return value;
    }

    public static double setValue(double value) {
        Main.value = value;
        return value;
    }

    public static void main(String[] args) throws InterruptedException {

        MyRunn myRunn = new MyRunn();
        Thread threadRunn = new Thread(myRunn);
        threadRunn.start();
        threadRunn.join();


        MyThread thread = new MyThread();
        thread.start();
        thread.join();


    }

}
