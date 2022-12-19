package com.overone.blok12.lesson70_71;

import com.overone.blok12.lesson72.AnimalsColor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparableTask {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat");
        Animal animal1 = new Animal("Dog" );
        Animal animal2 = new Animal("Pig");
        Animal animal3 = new Animal("Wolf");
        Animal animal4 = new Animal("Cow");
        Animal animal5 = new Animal("Duk");


        TreeSet <Animal> treeSet = new TreeSet<>();

        treeSet.add(animal);
        treeSet.add(animal1);
        treeSet.add(animal2);
        treeSet.add(animal3);
        treeSet.add(animal4);
        treeSet.add(animal5);




        for (Animal a: treeSet) {
            System.out.println(a);
        }
    }
}
