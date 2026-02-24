package JavaTraining.module1;

//Write a program to print the multiplication table of a given number using a for loop.

import java.util.Scanner;

public class Question4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int no = scanner.nextInt();
        System.out.println("\nMultiplication Table of " + no + ":");
        for (int i = 1; i <= 10; i++) {
            int result = no * i;
            System.out.println(no + " x " + i + " = " + result);
        }
    }
}
