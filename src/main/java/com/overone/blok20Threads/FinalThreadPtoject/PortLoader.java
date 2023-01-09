package com.overone.blok20Threads.FinalThreadPtoject;



public class PortLoader extends Thread{
    private Tunnel tunnel;
    private Type shipType;

    public PortLoader(Tunnel tunnel, Type shipType) {
        this.tunnel = tunnel;
        this.shipType =shipType;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.currentThread().setName("В корабль загрузили " + shipType);

                //Time to load the goods
                Thread.sleep(500);
                Ship ship = tunnel.get(shipType);
                if(ship!=null)
                    while (ship.countCheck()){
                        Thread.sleep(100);
                        ship.add(10);
                        System.out.println(ship.getCount() + " Корабль загружен. " + Thread.currentThread().getName());
                    }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
