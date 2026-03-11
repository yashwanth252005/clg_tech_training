package JavaTraining.module6;

//Solve the Two Sum problem using optimized approach.

import java.util.HashMap;
import java.util.Map;

public class Question5 {
    public int[] solveTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        Question5 ts = new Question5();
        int[] result = ts.solveTwoSum(new int[]{2, 7, 11, 15}, 9);

        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }
    }
}

