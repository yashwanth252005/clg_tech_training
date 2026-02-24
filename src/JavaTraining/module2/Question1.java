package JavaTraining.module2;

//Write a program with a method that calculates the factorial of a number using recursion

import java.util.Scanner;

public class Question1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        long result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }

    private static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
