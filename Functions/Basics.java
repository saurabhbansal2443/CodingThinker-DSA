package Functions;

public class Basics {
    public static void main(String[] args) { // Main function
        int[] arr = { 1, 4, 2, 48, 9 };
        MaxEle(arr);
    }

    public static void MaxEle(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
