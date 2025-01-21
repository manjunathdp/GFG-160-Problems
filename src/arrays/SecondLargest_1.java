package arrays;

public class SecondLargest_1 {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }
        if (secondLargest == Integer.MIN_VALUE)
            return -1;
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 20, 5, 6, 35};
        System.out.println("Second Largest Element: "+ getSecondLargest(arr));
    }
}
