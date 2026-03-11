package JavaTraining.module6;

//Find all pairs in an array whose sum equals a target value.

import java.util.HashSet;
import java.util.Set;

public class Question4 {
    public static void findPairs(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        System.out.println("Pairs found:");

        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        findPairs(arr, 7);
    }
}

