package com.overone.blok12Collections.lesson72;

import com.overone.blok12Collections.lesson70_71.Animal;

import java.util.Comparator;

public class AnimalsColor implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getColor().getRGB() > o2.getColor().getRGB()) {
            return 0;
        }
        if(o2.getColor().getRGB() < o1.getColor().getRGB()){
            return 1;
        }else
           return -1;

    }
}
