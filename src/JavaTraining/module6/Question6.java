package JavaTraining.module6;

//Find the majority element using Boyer–Moore Voting Algorithm.

public class Question6 {
    public static int findMajority(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        if (isMajority(nums, candidate)) {
            return candidate;
        }

        return -1;
    }

    private static boolean isMajority(int[] nums, int candidate) {
        int count = 0;
        for (int num : nums) {
            if (num == candidate) count++;
        }
        return count > nums.length / 2;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + findMajority(arr));
    }
}
