package com.overone.blok12.lesson63_67;

public class HeavyBox {

    private  int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox weight: "  + weight;
    }
}
