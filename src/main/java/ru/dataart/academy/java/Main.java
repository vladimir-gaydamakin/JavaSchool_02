package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculator;
import ru.dataart.academy.java.figures.Cirle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {
        System.out.println("Task for Java OOP");

        Calculator calc = new Calculator(new Figure[]{
                new Cirle(2.2), new Rectangle(4, 3.8), new Cirle(8),
                new Rectangle(2, 1), new Rectangle(0.4, 18),});
        System.out.format("sum of areas: %.4f", calc.getArea());
    }
}