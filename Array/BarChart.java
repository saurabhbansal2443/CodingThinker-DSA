package Array;

public class BarChart {
    public static void main(String[] args) {
        // Write a program to print the array elements in the barchart form
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        int maxLevel = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maxLevel < arr[i]) {
                maxLevel = arr[i];
            }
        }

        for (int level = maxLevel; level >= 1; level--) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= level) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // SpaceComplexity - O(1)
        // TimeComplecity - O(n*m)// m = max-element in array
    }
}
