package Array;

public class EvenElements {
    public static void main(String[] args) {
        // Write a program to count the number of even elements in an integer array

        int[] arr = { 1, 5, 3, 9, 1, 6, 2, 18, 0, 2 };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        // Time Complexity - O(n)
        // Space Complexity - O(1) 

        System.out.println(count);
    }
}
