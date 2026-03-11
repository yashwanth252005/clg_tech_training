package JavaTraining.module6;

//Construct a Prefix Sum array and answer multiple range sum queries.

public class Question2 {
    private int[] prefixSum;


    public Question2(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n + 1];
        prefixSum[0] = 0;

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }


    public int getRangeSum(int L, int R) {
        return prefixSum[R + 1] - prefixSum[L];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        Question2 rsq = new Question2(arr);

        System.out.println("Sum of range [1, 3]: " + rsq.getRangeSum(1, 3)); // 20 + 10 + 5 = 35
        System.out.println("Sum of range [0, 2]: " + rsq.getRangeSum(0, 2)); // 10 + 20 + 10 = 40
    }
}

