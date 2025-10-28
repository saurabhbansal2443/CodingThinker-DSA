package Loops;

import java.util.*;

public class PrintTable {
    public static void main(String[] args) {
        // Write a program that prints the multiplication table of a given number using
        // a loop.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "  " + "*" + "  " + i + "  " + "=" + "  " + n * i);
        }

    }
}
