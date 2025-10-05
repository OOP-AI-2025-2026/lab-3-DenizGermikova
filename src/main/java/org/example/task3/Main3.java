package org.example.task3;

public class Main3 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("red", 5, 10);
        Shape circle = new Circle("blue", 7);
        Shape triangle = new Triangle("green", 6, 8);

        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(triangle);
    }
}
