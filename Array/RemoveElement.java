package Array;

public class RemoveElement {
    public static void main(String[] args) {
        // How do you remove an element from an array in Java?
        int[] arr = { 1, 9, 3, 4, 3, 2, 3, 1, 5, 3 };

        int ele = 3;

        int countEle = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                countEle++;
            }
        }
        if (countEle > 0) {
            int[] narr = new int[arr.length - countEle];
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != ele) {
                    narr[idx] = arr[i];
                    idx++;
                }
            }
            arr = narr;
        }

        // Time Complexity - O(2n)
        // Space Complexity - O(n)

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }

    }
}
