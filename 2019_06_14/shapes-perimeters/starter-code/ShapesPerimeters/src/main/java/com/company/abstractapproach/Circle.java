package com.company.abstractapproach;

public abstract class Circle extends Shape {
    private double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double radius() {
        return radius();
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
