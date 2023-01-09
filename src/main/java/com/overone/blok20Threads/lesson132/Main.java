package com.overone.blok20Threads.lesson132;

public class Main {
    private static int value = 0;

    public int getValue() {
        return value;
    }

    public static synchronized void setValue(int value) {
        Main.value = value;

    }

    public static void main(String[] args) throws InterruptedException {


        testThread("FirstThread");
        testThread("SecondThread");
    }

    public static synchronized void testThread(String name) {
        if (name.equals("FirstThread")){
            FirstThread firstThread = new FirstThread();
            Thread threadF = new Thread(firstThread);
            threadF.setName("FirstThread");

            threadF.start();
            threadF.run();
            System.out.println(value);
        }else {
            SecondThread secondThread = new SecondThread();
            Thread threadS = new Thread(secondThread);
            threadS.setName("SecondThread");

            threadS.start();
            threadS.run();
            System.out.println(value);
        }
    }
}
