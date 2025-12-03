package ifelseAndBasics;
import java.util.*;

public class Calculator1 {
    public static void main(String[] args) {
        // Write a Java program to create a simple calculator for calculating a two
        // number calculations
        // Hint-> Take 2 Input of Number and one character as sign (-, +, *, /)

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        int m = sc.nextInt();

        if (ch == '+') {
            System.out.println(n + m);
        } else if (ch == '-') {
            System.out.println(n - m);
        } else if (ch == '*') {
            System.out.println(m * n);
        } else if (ch == '/') {
            System.out.println(n / m);
        } else {
            System.out.println("Invalid Operation");
        }

    }
}
