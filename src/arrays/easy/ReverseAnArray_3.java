package arrays.easy;

import java.util.Arrays;

public class ReverseAnArray_3 {
    public static void reverseArray(int arr[]) {
        // code here
        int start=0;
        int end = arr.length-1;
        while(end>start) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        System.out.println("Output: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 20, 5, 6, 35};
        System.out.println("Input: "+Arrays.toString(arr));
        reverseArray(arr);
    }
}
