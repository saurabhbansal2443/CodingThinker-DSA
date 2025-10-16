package Loops;

import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        // Write a program that asks the user to enter a
        // number and then prints the sum of the digits

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            int remNumber = n / 10;
            n = remNumber;
        }

        System.out.println(sum);
    }
}
