package Array;

public class FindIndexOfElement {
    public static void main(String[] args) {
        // How do you find the index of an element in an array in Java?

        int[] arr = { 2, 6, 8, 9, 1, 0, 4, 7 };

        int ele = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ele) {
                System.out.println(i);
            }
        }

        // Time Complexity - O(n)
        // Space Complexity - O(1)

    }

    public static int findIndex(int[] arr, int ele) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
}
