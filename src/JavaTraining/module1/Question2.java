package JavaTraining.module1;

//Write a program to find the largest of three numbers using if-else statements.

import java.util.Scanner;

public class Question2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        }
        else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        }
        else {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);
    }
}
