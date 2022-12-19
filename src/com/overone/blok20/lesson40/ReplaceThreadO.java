package com.overone.blok20.lesson40;

import java.util.concurrent.locks.ReentrantLock;

public class ReplaceThreadO extends Thread {
    String name;
    ReentrantLock locker;

    ReplaceThreadO(String n, ReentrantLock l) {
        name = n;
        locker = l;
    }

    public void run() {
        String str = Main.getStr();
        locker.lock();
        try {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'а') ;
                String newStr = str.replace('а', 'о');
                System.out.println(name + " - replace: " + newStr);

            }

        } catch (IllegalThreadStateException e) {
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }

    }
}
