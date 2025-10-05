package org.example.task3;

public final class Circle extends Shape {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + getColor() + '\'' +
                ", radius=" + radius +
                ", area=" + getArea() +
                '}';
    }
}
