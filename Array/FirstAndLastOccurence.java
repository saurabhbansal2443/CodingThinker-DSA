package Array;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        // How do you find the index of an element's first and last occurrences in an
        // array in Java?
        int[] arr = { 2, 3, 1, 8, 1, 9, 0, 1, 7 }; // {0,6,1,9,5}
        int ele = 1;
        // First Occurence is on 2nd index
        // Last Occurence is on 7th index
        int fo = -1;
        int lo = -1;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (flag == true && arr[i] == ele) {
                fo = i;
                lo = i;
                flag = false;
            } else if (arr[i] == ele) {
                lo = i;
            }
        }
        // Time Complexity - O(n)
        // Space Complexity - O(1)

        System.out.println("First Occurence is at " + fo);
        System.out.println("Last Occurence is at " + lo);

    }
}
