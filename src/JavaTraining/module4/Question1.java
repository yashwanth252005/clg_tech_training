package JavaTraining.module4;

//Create an abstract class Shape with an abstract method area(). Implement it in Circle
//and Rectangle classes.

import java.util.*;

abstract class Shape {
    public abstract double area();

    public void displayShapeType(String type) {
        System.out.println("Calculating area for: " + type);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5.0);
        Shape myRectangle = new Rectangle(10.0, 4.0);

        myCircle.displayShapeType("Circle");
        System.out.println("Area: " + String.format("%.2f", myCircle.area()));

        myRectangle.displayShapeType("Rectangle");
        System.out.println("Area: " + String.format("%.2f", myRectangle.area()));
    }
}

