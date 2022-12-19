package com.overone.blok20.lesson138_139;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        List<Integer> testList = Collections.synchronizedList(new ArrayList<>());
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task = () -> {
            incrementTestList(testList);

        };
        executorService.execute(task);
        executorService.shutdown();

        for (Integer i : testList) {
            System.out.println(i);
        }
    }

    private synchronized static void incrementTestList(List<Integer> testList) {

        for (int i = 0; i < testList.size(); i++) {
            Integer value = testList.get(i);
            testList.set(i, value + 10);
        }
    }

}
