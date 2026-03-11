package JavaTraining.module7;

//Find first and last occurrence of an element using Binary Search

import java.util.Arrays;

public class Question2 {
    public static int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;

        int first = findBound(arr, target, true);
        int last = findBound(arr, target, false);

        System.out.println("Target: " + target);
        System.out.println("First Occurrence: " + first); // Output: 1
        System.out.println("Last Occurrence: " + last);   // Output: 4
    }
}
