package com.overone.blok8.lesson38;

public interface BirdSwallow extends Bird{

    @Override
    default void sitDown() {
        System.out.println("BirdSwallow sit down");
    }

    @Override
    default void flyUp() {
        System.out.println("BirdSwallow fly up");
    }
}
