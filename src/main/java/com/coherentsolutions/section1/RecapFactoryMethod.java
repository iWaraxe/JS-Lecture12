package com.coherentsolutions.section1;

// RecapFactoryMethod.java

public class RecapFactoryMethod {

    public static void main(String[] args) {
        // Demonstrate Factory Method Pattern
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("Circle");
        circle.draw();

        // Add code here to create and draw other shapes
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class ShapeFactory {
    public Shape createShape(String type) {
        if ("Circle".equals(type)) {
            return new Circle();
        }
        // ... other shapes
        return null;
    }
}
