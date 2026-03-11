package JavaTraining.module6;

//Find the longest subarray with sum equal to k.

import java.util.HashMap;
import java.util.Map;

public class Question8 {
    public static int solve(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(currentSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(currentSum - k));
            }

            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Length of longest subarray: " + solve(arr, k));
    }
}

