package Loops;

import java.util.*;

public class Power {
    public static void main(String[] args) {
        // Write a program to find the power of a number
        // Take two inputs.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int ans = 1;

        for (int i = 1; i <= x; i++) {
            ans = ans * n;
        }

        System.out.println(ans);

    }
}
