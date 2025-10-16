package Loops;

import java.util.*;

public class PrintRev {
    public static void main(String[] args) {
        // Write a program that takes a number from user and prints its reverse

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum * 10 + lastDigit;
            int remNumber = n / 10;
            n = remNumber;
        }

        System.out.println(sum);
    }
}