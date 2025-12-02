package Array;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        int[] arr1 = { 9, 3, 7, 8, 6, 5, 2, 4 };
        int[] arr2 = { 4, 7, 7, 6, 9, 2, 0, 1 };
        int l1 = arr1.length;
        int l2 = arr2.length;
        int resLength = 0;
        if (l1 > l2) {
            resLength = l1;
        } else {
            resLength = l2;
        }
        int[] res = new int[resLength];
        int p1 = l1 - 1;
        int p2 = l2 - 1;
        int p3 = resLength - 1;

        int carry = 0;

        while (p3 >= 0) {
            int ele1 = p1 >= 0 ? arr1[p1] : 0;
            int ele2 = p2 >= 0 ? arr2[p2] : 0;
            int sum = ele1 + ele2 + carry;
            int d = sum % 10;
            carry = sum / 10;
            res[p3] = d;
            p3--;
            p2--;
            p1--;
        }

        if (carry == 1) {
            int[] res2 = new int[resLength + 1];
            res2[0] = 1;
            for (int i = 0; i < res.length; i++) {
                res2[i + 1] = res[i];
            }
            res = res2;
        }

        // SpaceComplexity - O(n)
        // TimeComplecity - O(n)

        System.out.println(Arrays.toString(res));
    }
}
