package JavaTraining.module5;

//Write a program using try-catch-finally to handle division by zero.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide a number by zero!");
        } catch (Exception e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            System.out.println("Cleaning up... Closing scanner.");
            sc.close();
        }

        System.out.println("Program finished.");
    }
}

