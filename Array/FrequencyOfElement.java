package Array;

public class FrequencyOfElement {
    public static void main(String[] args) {
        // Write a Java program to find the frequency of an element in an array.
        int[] arr = { 2, 3, 1, 8, 1, 9, 0, 1, 7 };

        int ele = 1;

        // Number of occurence

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }

        // Time Complexity - O(n)
        // Space Complexity - O(1)

        System.out.println(count);
    }
}
