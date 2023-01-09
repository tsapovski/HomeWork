package com.overone.blok12Collections.lesson60_61;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorQ {
    private static final int COUNT = 10;
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i <COUNT; i++) {
            priorityQueue.add(random.nextInt(100));

        }
    double temp = 0;
        for (int pQ:priorityQueue) {
            temp +=pQ;
            System.out.println(pQ);

        }
        System.out.println("Длина чисел: "+ String.valueOf(temp).length());

        System.out.println("Среднее значение чисел: "+temp/COUNT);
    }
}
