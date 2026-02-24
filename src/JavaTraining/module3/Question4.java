package JavaTraining.module3;

//Write a program to demonstrate the difference between method overloading and method overriding.

class Printer {
    void print() {
        System.out.println("Printing from the Parent class.");
    }
}

class SmartPrinter extends Printer {
    @Override
    void print() {
        System.out.println("Printing from the SmartPrinter (Overridden).");
    }
    void print(String message) {
        System.out.println("Printing custom message: " + message);
    }
}

public class Question4 {
    public static void main(String[] args) {
        SmartPrinter myPrinter = new SmartPrinter();
        myPrinter.print();
        myPrinter.print("Hello Overloading!");
    }
}
