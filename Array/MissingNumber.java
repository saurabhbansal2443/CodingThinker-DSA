package Array;

public class MissingNumber {
    public static void main(String[] args) {
        // Write a program to find the missing number in a given range of integers
        // represented by an array.

        int[] arr = { 1, 3, 4, 5, 6 };

        int arraySum = 0;

        int l = arr.length;
        int m = l + 1;
        for (int i = 0; i < l; i++) {
            arraySum += arr[i];
        }

        int expectedSum = (m * (m + 1)) / 2;

        int missingNumber = expectedSum - arraySum;

        System.out.println(missingNumber);

    }
}
