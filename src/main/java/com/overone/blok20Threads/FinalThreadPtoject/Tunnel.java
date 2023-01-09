package com.overone.blok20Threads.FinalThreadPtoject;

import java.util.ArrayList;
import java.util.List;

public class Tunnel {

    private List<Ship> store;
    private static final int maxPassability = 5;
    private static final int minPassability = 0;
    private int shipsCounter = 0;

    public Tunnel() {
        store = new ArrayList<>();
    }

    public synchronized boolean add(Ship element) {

        try {
            if (shipsCounter < maxPassability) {
                notifyAll();
                store.add(element);
                String info = String.format(" %s размер - %s; перевозимый груз - %s;  Корабль входит в туннель", store.size(), element.getSize(), element.getType());
                System.out.println(Thread.currentThread().getName() + info);
                shipsCounter++;

            } else {
                System.out.println(store.size() + "> Туннель занят: " + Thread.currentThread().getName());
                wait();
                return false;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public synchronized Ship get(Type shipType) {

        try {
            if (shipsCounter > minPassability) {
                notifyAll();
                for (Ship ship : store) {
                    if (ship.getType() == shipType) {
                        shipsCounter--;
                        System.out.println(store.size() + "- Корабль освободил туннель: " + Thread.currentThread().getName());
                        store.remove(ship);
                        return ship;
                    }
                }
            }

            System.out.println("0 < туннель пуст");
            wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}