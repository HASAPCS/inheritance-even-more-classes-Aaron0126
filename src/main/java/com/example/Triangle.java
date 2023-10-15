package com.example;

public class Triangle extends Shape {
    public int adjacent;
    public int opposite;
    public int hypotenuse;
    public Triangle (int adjacent, int opposite, int hypotenuse){
        this.adjacent = adjacent;
        this.opposite = opposite;
        this.hypotenuse = hypotenuse;
    }
    // TODO: Define attributes for the triangle

    @Override
    public double area() {
        // TODO: Implement the method
        return adjacent*opposite/2;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return adjacent+opposite+hypotenuse;
    }
}

// TODO: Implement similar classes for Circle and Square
