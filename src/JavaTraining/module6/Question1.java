package JavaTraining.module6;

//Find the maximum subarray sum using Kadane’s Algorithm.

public class Question1 {
    public static int maxSubArraySum(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentMax = 0;

        for (int i = 0; i < nums.length; i++) {
            currentMax += nums[i];

            if (maxSoFar < currentMax) {
                maxSoFar = currentMax;
            }

            if (currentMax < 0) {
                currentMax = 0;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
    }
}
