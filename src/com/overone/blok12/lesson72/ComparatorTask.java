package com.overone.blok12.lesson72;
import com.overone.blok12.lesson70_71.Animal;
import java.awt.*;
import java.util.ArrayList;

public class ComparatorTask {
    public static void main(String[] args) {

        ArrayList<Animal> list = new ArrayList<Animal>();

        list.add(new Animal("Cat", Color.GRAY));
        list.add(new Animal("Dog", Color.BLACK));
        list.add(new Animal("Pig", Color.ORANGE));
        list.add(new Animal("Wolf", Color.DARK_GRAY));
        list.add(new Animal("Cow", Color.WHITE));
        list.add(new Animal("Duk", Color.CYAN));
        AnimalsColor animalsColor = new AnimalsColor();
        list.sort(animalsColor);

        for (Animal a: list) {
            System.out.println(a);
        }
    }
}
