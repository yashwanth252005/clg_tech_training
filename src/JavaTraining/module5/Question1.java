package JavaTraining.module5;

//Write a program to demonstrate checked and unchecked exceptions with examples.

import java.io.*;

public class Question1 {
    public static void main(String[] args) {

        try {
            System.out.println("Testing Checked Exception ");
            FileReader file = new FileReader("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught Checked: File was not found!");
        }

        try {
            System.out.println("\nTesting Unchecked Exception ");
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked: Cannot divide by zero!");
        }

        System.out.println("\nProgram continued successfully.");
    }
}

