package com.overone.blok8FeaturesOOP.lesson29;

public class Main {
    public static void main(String[] args) {

        Order order = new Order("phone", "20-33");
        Customer customer = new Customer("phone", "20-33");
        customer.check(order);

    }
}
