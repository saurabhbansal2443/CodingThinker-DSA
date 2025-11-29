package Array;

public class IsArrayAscending {
    public static void main(String[] args) {
        // Write a program to check if an array is sorted in ascending order.

        int[] arr = { 1, 2, 3, 4, 5, 6, 8 };

        boolean flag = true; // we are assuming that the array is sorted

        // Now we will run a loop to check weather there is some elements which is not
        // sorted

        for (int i = 1; i < arr.length; i++) {
            int currEle = arr[i];
            int prevEle = arr[i - 1];

            if (prevEle > currEle) {
                flag = false;
                break;
            }
        }
        // Time Complexity - O(n)
        // Space Complexity - O(1)

        System.out.println(flag);

    }
}
