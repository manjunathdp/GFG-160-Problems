package arrays.medium;

import java.util.Arrays;

public class RotateArray {
    static void rotateArr(int arr[], int d) {

        // add your code here

        d = d % arr.length;

        arr = reverse(arr, 0, d - 1);
        arr = reverse(arr, d, arr.length - 1);
        arr = reverse(arr, 0, arr.length - 1);

        System.out.println("Output: " + Arrays.toString(arr));

    }

    static int[] reverse(int[] arr, int start, int end) {
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 20, 5, 6, 35};
        System.out.println("Input: " + Arrays.toString(arr));
        rotateArr(arr, 2);
    }
}
