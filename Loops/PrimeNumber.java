package Loops;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        // Write a program that asks the user to enter a number
        // and then checks whether it is a prime number using a loop

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 2 || n == 3) {
            System.out.println("Prime Number");
        } else if (n % 2 == 0) {
            System.out.println("Non Prime Number");
        }

        boolean flag = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non Prime Number");
        }

    }
}
