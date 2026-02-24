package JavaTraining.module1;

//Write a program that takes a student's marks as input and prints the corresponding grade (A, B, C, D, or F) using a switch statement.

import java.util.Scanner;

public class Question3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered!");
            return;
        }
        switch (marks / 10) {
            case 10, 9:
                System.out.println("Grade A");break;
            case 8 :
                System.out.println("Grade B");break;
            case 7 :
                System.out.println("Grade c");break;
            case 6 :
                System.out.println("Grade D");break;
            default :
                System.out.println("Grade F");break;
        };
    }
}
