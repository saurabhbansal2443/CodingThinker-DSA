package Array;

public class Maximum {
    public static void main(String[] args) {
        // How do you find the maximum element in an array in Java?
        int[] arr = { -9, 1, 100, 4, 2, 1000, 90, 6 };

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int ele = arr[i];

            if (max < ele) {
                max = ele;
            }
        }

        // Time Complexity - O(n)
        // Space Complexity - O(1)

        System.out.println(max);

    }
}
