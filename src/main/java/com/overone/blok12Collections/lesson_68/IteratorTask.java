package com.overone.blok12Collections.lesson_68;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorTask {

    public static void main(String[] args) {


        Integer[] number = {1,2,3,5,6,3,7,2,4,6,7,8};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(number));

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            int num = iterator.next();

            if(num%2==0){
                System.out.println(num);
            }else
                iterator.remove();
        }
    }
}
