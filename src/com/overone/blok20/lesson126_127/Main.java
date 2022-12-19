package com.overone.blok20.lesson126_127;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        Runnable task = () -> {
            System.out.println(dateFormat.format(date));
        };
        Thread thread = new Thread(task);
        thread.start();

    }

}
