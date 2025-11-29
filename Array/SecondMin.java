package Array;

public class SecondMin {
    public static void main(String[] args) {
        // find second min

        int[] arr = { 2, 4, 1, 9, 8, 6, 3, 10 };

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            if (min > ele) {
                smin = min;
                min = ele;
            } else if (smin > ele) {
                smin = ele;
            }
        }
        // Time Complexity - O(n)
        // Space Complexity - O(1)

        System.out.println("minimum " + min + " SecondMinimum " + smin);
    }
}
