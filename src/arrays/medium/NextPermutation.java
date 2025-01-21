package arrays.medium;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;

        // Step 1: Find the rightmost index where arr[i] < arr[i + 1]
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot found, reverse the entire array (last permutation case)
        if (pivot == -1) {
            Arrays.sort(arr);
            return;
        }

        // Step 3: Find the smallest number greater than arr[pivot] to its right
        int nextHigestIndex = -1;
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                nextHigestIndex = i;
                break;
            }
        }

        // Step 4: Swap pivot and nextHigestIndex
        swap(arr, pivot, nextHigestIndex);

        // Step 5: Reverse the array from pivot + 1 to end
        reverse(arr, pivot + 1, n - 1);
    }

    // Helper method to swap two elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper method to reverse a part of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        System.out.println("Input: " + Arrays.toString(arr));
        nextPermutation(arr);
        System.out.println("Output: " + Arrays.toString(arr));
    }
}
