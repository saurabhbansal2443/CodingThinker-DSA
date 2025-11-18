package Array;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        // How do you sort an array in Java?

        int[] arr = { 1, 56, 4, 9, 2, 8, 4, 0 };

        Arrays.sort(arr);
        // We will learn in upcoming lectures
        // Bubble Sort ,Selection Sort , Insertion Sort , Quick Sort , Merge sort

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
