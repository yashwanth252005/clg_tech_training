package JavaTraining.module7;

//Implement Insertion Sort and explain its advantage for nearly sorted arrays.

import java.util.Arrays;

public class Question6 {
    public static void sort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
