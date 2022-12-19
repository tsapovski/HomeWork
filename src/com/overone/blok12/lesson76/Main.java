package com.overone.blok12.lesson76;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] mass = {4, 3, 234, 12,43 , 123, 55, 2, 342, 5};

        Arrays.sort(mass);

        System.out.println(Arrays.toString(mass));

        int [] newMass = Arrays.copyOfRange(mass, 6,9);
        System.out.println(Arrays.toString(newMass));
       if (mass.equals(newMass)){
           System.out.println("Массивы одинаковой длины и элементы равны");
       }else
           System.out.println("Массивы разные");
    }
}
