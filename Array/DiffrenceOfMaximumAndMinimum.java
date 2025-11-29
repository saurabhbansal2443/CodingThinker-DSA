package Array;

public class DiffrenceOfMaximumAndMinimum {
    public static void main(String[] args) {
        // Write a Java program to find the difference between the largest and smallest
        // elements in an array.
        // Write a Java program to find the maximum and minimum elements in an array
        // using a single loop.

        int[] arr = { 0, 7, 6, 1, 3, 2, 4, 5, 0, 8 }; // n 

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            if (max < ele) {
                max = ele;
            } else if (min > ele) {
                min = ele;
            }
        }

        // Time Complexity - O(n)
        // Space Complexity - O(1)

        System.out.println(max - min);

    }
}
