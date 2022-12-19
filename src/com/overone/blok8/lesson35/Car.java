package com.overone.blok8.lesson35;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private int enginePower;
    private int releaseYear;

    public Car(String model, int releaseYear) {
        this.model = model;
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return releaseYear == car.releaseYear &&
                model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, releaseYear);
    }
}
