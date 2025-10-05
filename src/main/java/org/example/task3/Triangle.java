package org.example.task3;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + getColor() + '\'' +
                ", base=" + base +
                ", height=" + height +
                ", area=" + getArea() +
                '}';
    }
}
