package arrays;

import java.util.Arrays;

public class PushZerosToEnd_2 {
    public static void pushZerosToEnd(int[] arr) {
        // code here
        int nonZero = 0;
        for(int i = 0; i<arr.length;i++) {
            if(arr[i]!=0) {
                arr[nonZero]=arr[i];
                nonZero++;
            }
        }
        for(int i = nonZero;i<arr.length;i++) {
            arr[i]=0;
        }
        System.out.println("Output: "+Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 20, 5, 6, 35};
        System.out.println("Input: "+Arrays.toString(arr));
        pushZerosToEnd(arr);
    }
}
