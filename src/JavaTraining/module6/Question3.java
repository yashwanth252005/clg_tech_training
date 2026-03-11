package JavaTraining.module6;

//Implement the Difference Array technique for range updates.

import java.util.Arrays;

public class Question3 {
    private int[] diff;
    private int n;

    public Question3(int[] original) {
        this.n = original.length;
        this.diff = new int[n + 1];

        diff[0] = original[0];
        for (int i = 1; i < n; i++) {
            diff[i] = original[i] - original[i - 1];
        }
    }

    public void update(int L, int R, int val) {
        diff[L] += val;
        if (R + 1 < n) {
            diff[R + 1] -= val;
        }
    }

    public int[] getResult() {
        int[] res = new int[n];
        res[0] = diff[0];
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 40};
        Question3 da = new Question3(arr);

        da.update(1, 3, 10);

        System.out.println(Arrays.toString(da.getResult()));
    }
}

