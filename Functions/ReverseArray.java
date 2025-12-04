package Functions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 48, 6, 0, 9, 7 };

        // ReverseSelf(arr);

        int[] res2 = Reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res2));
    }

    public static int[] Reverse(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        int[] res = new int[arr.length];
        int idx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[idx] = arr[i];
            idx++;
        }

        return res;

    }

    public static void ReverseSelf(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return;
        }
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            int k = arr[st];
            arr[st] = arr[end];
            arr[end] = k;
            st++;
            end--;
        }
    }

}
