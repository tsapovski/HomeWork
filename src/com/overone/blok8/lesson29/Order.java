package com.overone.blok8.lesson29;

public class Order {
    private int weight;
    private String name;
    private String address;

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return
                 "Order: " +name + " " + address;
    }
}
