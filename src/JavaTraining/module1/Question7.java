package JavaTraining.module1;

//Write a program to print a pyramid pattern using nested loops for a given number of rows.

import java.util.Scanner;

public class Question7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
