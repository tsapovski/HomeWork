package com.overone.blok20.FinalThreadPtoject;

import java.awt.*;

import java.util.Random;

public class Creator extends Thread{


        private Tunnel tunnel;
        private int shipCount;

        public Creator(Tunnel tunnel, int shipCount) {
            this.tunnel = tunnel;
            this.shipCount = shipCount;
        }

        @Override
        public void run() {
            int count = 0;
            while (count < shipCount) {
                Thread.currentThread().setName("Создан корабль ");
                count++;
                tunnel.add(new Ship(getRandomSize(), getRandomType()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private Type getRandomType() {
            Random random = new Random();
            return Type.values()[random.nextInt(Type.values().length)];
        }

        private Size getRandomSize() {
            Random random = new Random();
            return Size.values()[random.nextInt(Size.values().length)];
        }

}
