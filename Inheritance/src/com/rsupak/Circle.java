package com.rsupak;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius >= 0 ? radius : 0;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
