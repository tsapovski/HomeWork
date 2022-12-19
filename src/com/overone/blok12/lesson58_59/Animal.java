package com.overone.blok12.lesson58_59;

import java.util.ArrayList;
import java.util.LinkedList;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException {
        long linkedTime = timeWorkLinkedList();
        System.out.println("\n"+"Linked list time work: "+linkedTime/1000000);
        long arrayTime = timeWorkArrayList();
        System.out.println("\n"+"Array list time work: "+arrayTime/1000000);
    }
        public static long timeWorkLinkedList() throws InterruptedException {
            long start = System.nanoTime();
            Animal animal = new Animal("pig");
            Animal animal1 = new Animal("Lion");
            Animal animal2 = new Animal("Tiger");
            Animal animal3 = new Animal("cat");
            Animal animal4 = new Animal("Dog");
            Animal animal5 = new Animal("Cow");
            Animal animal6 = new Animal("monkey");
            Animal animal7 = new Animal("Wolf");
            Animal animal8 = new Animal("fox");
            Animal animal9 = new Animal("bear");

            LinkedList<Animal> linkedList = new LinkedList<>();

            linkedList.add(animal);
            linkedList.add(animal1);
            linkedList.add(animal2);
            linkedList.add(animal3);
            linkedList.add(animal4);
            linkedList.add(animal5);
            linkedList.add(animal6);
            linkedList.add(animal7);
            linkedList.add(animal8);
            linkedList.add(animal9);

            for (int i = 0; i < linkedList.size(); i++) {

                for (int j = 0; j < linkedList.get(i).getName().length(); j++) {
                    if (Character.isUpperCase(linkedList.get(i).getName().charAt(0))) {
                        linkedList.remove(i);
                    }

                }

                System.out.print(linkedList.get(i).getName()+" ");
            }
            Thread.sleep(1000);
            long finish = System.nanoTime();
            long res = finish - start;
            return res;
        }

    public static long timeWorkArrayList() throws InterruptedException {
        long start = System.nanoTime();

        Animal animal = new Animal("pig");
        Animal animal1 = new Animal("Lion");
        Animal animal2 = new Animal("Tiger");
        Animal animal3 = new Animal("cat");
        Animal animal4 = new Animal("Dog");
        Animal animal5 = new Animal("Cow");
        Animal animal6 = new Animal("monkey");
        Animal animal7 = new Animal("Wolf");
        Animal animal8 = new Animal("fox");
        Animal animal9 = new Animal("bear");
        ArrayList<Animal> arrayList = new ArrayList<>();

        arrayList.add(animal);
        arrayList.add(animal1);
        arrayList.add(animal2);
        arrayList.add(animal3);
        arrayList.add(animal4);
        arrayList.add(animal5);
        arrayList.add(animal6);
        arrayList.add(animal7);
        arrayList.add(animal8);
        arrayList.add(animal9);
        for (int i = 0; i < arrayList.size(); i++) {

            for (int j = 0; j < arrayList.get(i).getName().length(); j++) {
                if (Character.isUpperCase(arrayList.get(i).getName().charAt(0))) {
                    arrayList.remove(i);
                }

            }

            System.out.print(arrayList.get(i).getName()+" ");
        }

        Thread.sleep(1000);
        long finish = System.nanoTime();
        long res = finish - start;
        return res;
    }
    public String getName() {
        return name;
    }
}
/*В общем разницы нет. Я так понял они просто в разных задачах ведут себя по-разному.*/
