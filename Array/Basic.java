package Array;

public class Basic {
    public static void main(String[] args) {
        // declartion
        int[] arr = { 1, 2, 3, 4, 5 };
        // intialization
        int[] arr2 = new int[4]; // [0,0,0,0]

        // Access an element in array
        // System.out.println(arr[3]);

        // change a element of array
        arr[2] = 999;

        // Length of array

        // System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
