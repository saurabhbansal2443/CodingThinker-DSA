package Array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // Write a program to remove duplicates from an integer sorted array.

        int[] arr = { 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 6, 7 };

        int[] ans = new int[arr.length];

        ans[0] = arr[0];

        int idx = 1;

        int st = 0;
        int end = 1;

        while (end < arr.length) {

            if (arr[st] == arr[end]) {
                end++;
            } else {
                ans[idx] = arr[end];
                idx++;
                st = end;
                end++;
            }
        }

        // Time Complexity - O(n)
        // Space Complexity - O(n)

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "    ");
        }

    }
}
