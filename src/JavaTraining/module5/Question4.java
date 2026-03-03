package JavaTraining.module5;

//Write a program that throws an exception if age is less than 18.

import java.util.*;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Question4 {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access Denied: Age must be at least 18.");
        } else {
            System.out.println("Access Granted: Welcome!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        try {
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Error caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

