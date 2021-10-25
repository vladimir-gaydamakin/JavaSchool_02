package ru.dataart.academy.java.figures;

public class Cirle extends Figure {
    private final double radius;

    public Cirle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("please enter positive number");
        }
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
