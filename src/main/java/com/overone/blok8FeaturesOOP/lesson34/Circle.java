package com.overone.blok8FeaturesOOP.lesson34;

public class Circle {

     static final double Pi = 3.14;

     static double radius;

     private double area;

     private double circleLength;

    public Circle(double radius) {
        this.radius = radius;
    }

    static double calculateArea(){
        return Pi*(Math.pow(radius,2));
    }

    static double calculateCircleLength(){
        return Pi*2*radius;
    }

    public void setArea(double area) {
        this.area = area;
        System.out.println(area);
    }

    public void setCircleLength(double circleLength) {
        this.circleLength = circleLength;
        System.out.println(circleLength);
    }
}

