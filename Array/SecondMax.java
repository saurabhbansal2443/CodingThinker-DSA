package Array;

public class SecondMax {
    public static void main(String[] args) {
        // find second max

        int[] arr = { 2, 4, 1, 9, 8, 6, 3, 10 };

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            if (max < ele) {
                smax = max;
                max = ele;
            } else if (smax < ele) {
                smax = ele;
            }
        }
        // Time Complexity - O(n)
        // Space Complexity - O(1)

        System.out.println("Maximum " + max + "SecondMaximum " + smax);
    }
}
