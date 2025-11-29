package Array;

public class Concatenate {
    public static void main(String[] args) {
        // How do you concatenate an array in Java?

        int[] arr1 = { 1, 4, 7, 2, 4, 0 }; // n
        int[] arr2 = { 2, 1, 7, 8, 9 }; // m 

        // res = {1, 4, 7, 2, 4, 0, 2, 1, 7, 8, 9 }

        int length1 = arr1.length;
        int length2 = arr2.length;

        int[] res = new int[length1 + length2];

        for (int i = 0; i < res.length; i++) {

            if (i < length1) {
                res[i] = arr1[i];
            } else {
                res[i] = arr2[i - length1];
            }
        }
        // Time Complexity - O(n+m)
        // Space Complexity - O(n+m)
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + "    ");
        }

    }
}
