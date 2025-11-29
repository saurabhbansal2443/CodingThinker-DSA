package Array;

public class SumOfElementAtEvenIndex {
    public static void main(String[] args) {
        // Write a program to find the sum of elements at even indexes in an integer
        // array.
        int[] arr = { 1, 2, 3, 4, 5, 6, 8 };

        int sum = 0;

        for (int i = 0; i < arr.length; i += 2) {
            sum = sum + arr[i];
        }
        // Time Complexity - O(n)
        // Space Complexity - O(1)

        System.out.println(sum);
    }
}
