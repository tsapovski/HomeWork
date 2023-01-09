package com.overone.blok8FeaturesOOP.lesson38;

public interface FinchBird extends Bird{
    @Override
    default void sitDown() {
        System.out.println("FinchBird sit down");
    }

    @Override
    default void flyUp() {
        System.out.println("FinchBird fly up");
    }
}
