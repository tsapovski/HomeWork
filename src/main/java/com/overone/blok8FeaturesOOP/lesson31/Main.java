package com.overone.blok8FeaturesOOP.lesson31;

public class Main {
    public static void main(String[] args) {
        State area = new Area("Argentina");
        State state = new State("China");

        System.out.println(state.getCountry());
        System.out.println(area.getCountry());
        area.setCountry("Argentina");
    }
}
