package com.overone.blok12.lesson73_75;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        Shop shop1 = new Shop(12, "bananas");
        Shop shop2 = new Shop(10, "apple");
        Shop shop3 = new Shop(12, "cherry");
        Shop shop4 = new Shop(9, "potato");
        Shop shop5 = new Shop(8,"carrot");
        Shop shop6 = new Shop(7,"tomato");

        HashMap <Integer ,String> catalog = new HashMap<>();

        catalog.put(shop1.getPrice(), shop1.getName());
        catalog.put(shop2.getPrice(), shop2.getName());
        catalog.put(shop3.getPrice(), shop3.getName());
        catalog.put(shop4.getPrice(), shop4.getName());
        catalog.put(shop5.getPrice(), shop5.getName());
        catalog.put(shop6.getPrice(), shop6.getName());

        for (Map.Entry<Integer, String> all:catalog.entrySet()) {

            System.out.println("price = " + all.getKey() + ", name - " + all.getValue());
            
        }

    }
}
