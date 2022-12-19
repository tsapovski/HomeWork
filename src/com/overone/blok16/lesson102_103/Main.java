package com.overone.blok16.lesson102_103;

public class Main {
    public static void main(String[] args) {
//        Cow cow = new Cow();
//        Cow cow1 = new Cow();
//        Tiger tiger = new Tiger();
//        Animal animal = new Animal(cow1, tiger);
        Generic generic = new Generic();
        Animal animal = new Cow();
        Animal animal1 = new Cat();

        generic.print(animal);
        generic.print(animal1);


    }
}
