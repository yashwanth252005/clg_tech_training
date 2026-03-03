package JavaTraining.module4;

//Write a program to reverse a string using StringBuilder

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + sb.toString());

        scanner.close();
    }
}

