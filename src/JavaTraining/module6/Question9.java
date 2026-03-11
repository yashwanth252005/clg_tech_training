package JavaTraining.module6;

//Find the missing number from an array containing numbers from 1 to n

import java.util.Arrays;

public class Question9 {

    public static int findMissingSum(int[] nums, int n) {
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = 8;

        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Value of n: " + n);

        int missing = findMissingSum(arr, n);

        System.out.println("The missing number is: " + missing);
    }
}
