package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {
    private final double width;
    private final double length;

    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }
}
