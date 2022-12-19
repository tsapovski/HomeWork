package com.overone.blok12.lesson70_71;
import java.awt.*;
public class Animal implements Comparable<Animal>{
    private String name;
    private Color color;

    public Animal(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int compareTo(Animal a) {
        return name.compareTo(a.getName());
    }

    @Override
    public String toString() {
        return "Animal name: " + name +" color -"+ color ;
    }
}
