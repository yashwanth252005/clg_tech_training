package JavaTraining.module6;

// Partition an array so that negative numbers appear before positives.

import java.util.Arrays;

public class Question7 {
    public static void partition(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, -3, 2, -7, 0, -1, 8, -2};

        System.out.println("Original Array: " + Arrays.toString(arr));

        partition(arr);

        System.out.println("Partitioned Array: " + Arrays.toString(arr));
    }
}

