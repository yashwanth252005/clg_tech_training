package JavaTraining.module2;

//Write a program with a method that checks whether a given string is a palindrome.

import java.util.Scanner;

public class Question2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println(input + " - is a palindrome.");
        } else {
            System.out.println(input + " - is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
