package com.overone.blok12Collections.lesson55_56_57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> even = new ArrayList<>();
        List<Integer> notEven = new ArrayList<>();

        Integer[] integers = new Integer[20];
        int min = 1;
        int max = 20;
        for (int i = 0; i < integers.length; i++) {
            integers[i] = (int)(Math.random()*(max-min)+min);
        }
        List<Integer> list = Arrays.asList(integers);

        for (Integer i: list) {
            if(i%2 == 0){
                even.add(i);
            }else{
                notEven.add(i);
            }
        }
        System.out.println(even);
        System.out.println(notEven);
        if(even.size()>notEven.size()){
            System.out.println("Quantity even numbers:" + even.size());
        }else if(notEven.size()>even.size()){
            System.out.println("Quantity not even numbers:" + notEven.size());
        }else
            System.out.println("Lists is equal");
        /*Не смог разобраться, как автоматизировать заполнение списка. Поэтому не придумал ничего другого, как преобразовать заполненный массив в список. Но я думаю метод должен быть. Буду благодарен если натолкнешь на мысль.*/
    }
}
