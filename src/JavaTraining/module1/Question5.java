package JavaTraining.module1;

//Write a program to find the sum of all even numbers between 1 and 100 using a while  loop

public class Question5 {
    static void main() {
        int sum = 0;
        int number = 1;
        while (number <= 100) {
            if (number % 2 == 0) {
                sum += number;
            }
            number++;
        }
        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
}
