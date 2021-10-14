package ru.dataart.academy.java.figures;

public class Calculator {
    Figure[] figures;

    public Calculator(Figure[] figures) {
        this.figures = figures.clone();
    }

    public double getArea() {
        double area = 0;
        for (Figure f : figures) {
            area += f.getArea();
        }
        return area;
    }
}
