package Loops;

import java.util.*;

public class Fibbonnci {
    public static void main(String[] args) {
        // Write a program that prints the Fibonacci sequence
        // up to a given number using a loop

        int n = 7;
        int ft = 0;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(ft);
            int tt = ft + st;
            ft = st;
            st = tt;
        }
    }
}
