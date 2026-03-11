package JavaTraining.module6;

//Rearrange an array so that even index contains even numbers.

import java.util.Arrays;

public class Question10 {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < n && oddIndex < n) {
            if (arr[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }
            else if (arr[oddIndex] % 2 != 0) {
                oddIndex += 2;
            }
            else {
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;
                evenIndex += 2;
                oddIndex += 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 4, 1, 6};
        System.out.println("Original: " + Arrays.toString(arr));

        rearrange(arr);

        System.out.println("Rearranged: " + Arrays.toString(arr));
    }
}

