package JavaTraining.module2;

//Write a program to demonstrate method overloading by creating multiple methods with the same name but different parameters.

public class Question3 {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int sum1 = add(10, 20);
        int sum2 = add(10, 20, 30);

        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
    }
}
