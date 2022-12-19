package com.overone.blok20.FinalThreadPtoject;

public enum Size {
    Маленький(10), Средний(50), Большой(100);

    Size(int value){
        this.value = value;
    }
    private int value;

    public int getValue() {
        return value;
    }
}
