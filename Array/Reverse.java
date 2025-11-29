package Array;

public class Reverse {
    public static void main(String[] args) {
        // Reverse a given array

        int[] arr = { 7, 9, 3, 2, 0, 5, 1 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int k = arr[start];
            arr[start] = arr[end];
            arr[end] = k;

            start++;
            end--;
        }

        // Time Complexity - O(n)
        // Space Complexity - O(1)

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
