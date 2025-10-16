package Loops;

import java.util.*;

public class ArmStrongNumber {
    public static void main(String[] args) {
        // Write a program that asks the user to enter a number and then prints
        // whether it is an Armstrong number or not using a loop
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nCopy = n;

        int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum = sum + (ld * ld * ld);
            int rem = n / 10;
            n = rem;
        }

        if (nCopy == sum) {
            System.out.println("ArmStrong number");
        } else {
            System.out.println("Not ArmStrong ");
        }

    }
}
