package Array;

public class Copy {
    public static void main(String[] args) {
        // Copy of Array in Java

        int[] arr = { 1, 3, 6, 9, 1, 0 }; //n 

        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
         // Time Complexity - O(n)
        // Space Complexity - O(n)
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + "    ");
        }
    }
}
