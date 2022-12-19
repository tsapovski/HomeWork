package com.overone.blok12.lesson62;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
public class Capital {
    String name;

    public Capital(String name) {
        this.name = name;
    }
}

    class Main {
        public static void main(String[] args) {

            ArrayDeque<Capital> cap = new ArrayDeque<>();

            Capital belarus = new Capital("Minsk");
            Capital usa = new Capital("Washington");
            Capital thailand = new Capital("Bangkok");
            Capital germany = new Capital("Berlin");

            cap.addFirst(belarus);
            cap.add(usa);
            cap.add(thailand);
            cap.addLast(germany);

            System.out.println("First: "+cap.getFirst().name + "Last: "+cap.getLast().name);
            System.out.println("Collection length: "+cap.size());
        }
    }
