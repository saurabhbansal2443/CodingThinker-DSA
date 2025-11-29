package Array;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = { -9, 1, 100, 4, 2, 1000, 90, 6 };

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int ele = arr[i];

            if (min > ele) {
                min = ele;
            }
        }
        // Time Complexity - O(n)
        // Space Complexity - O(1)

        System.out.println(min);

    }
}
