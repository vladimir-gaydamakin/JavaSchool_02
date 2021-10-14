package ru.dataart.academy.java.figures;

public class Cirle extends Figure {
    private double radius;

    public Cirle(double radius) {
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
