package Array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        // Write a program to remove duplicates from an integer sorted array.

        int[] arr1 = { 1, 3, 5, 6, 7, 7, 8 };
        int[] arr2 = { 1, 2, 3, 4, 5, 9, 10 };

        int[] res = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p3 < res.length) {

            int ele1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int ele2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if (ele1 < ele2) {
                res[p3] = ele1;
                p1++;
            } else {
                res[p3] = ele2;
                p2++;
            }
            p3++;
        }

        // Time Complexity - O(n+m)
        // Space Complexity - O(n+m)

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + "    ");
        }
    }
}
