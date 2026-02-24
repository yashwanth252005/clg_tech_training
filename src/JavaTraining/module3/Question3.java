package JavaTraining.module3;

//Write a program to demonstrate polymorphism using method overriding with a base class Shape and derived classes Circle and Rectangle.

class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Shape myShape;

        myShape = new Circle();
        myShape.draw();

        myShape = new Rectangle();
        myShape.draw();
    }
}
