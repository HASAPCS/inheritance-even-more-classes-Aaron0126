package com.example;

public class Circle extends Shape { 
    private int radius;
    public Circle (int radius) {
        this.radius=radius;
    }

    // TODO: Define attributes for the circle

    @Override
    public double area() {
        // TODO: Implement the method
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return Math.PI*2*radius;
    }
}