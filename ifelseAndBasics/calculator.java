package ifelseAndBasics;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        // Write a Java program to create a simple calculator for calculating a two
        // number calculations
        // Hint-> Take 2 Input of Number and one character as sign (-, +, *, /)
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        char sign = sc.next().charAt(0);
        int num2 = sc.nextInt();

        if (sign == '+') {
            System.out.println(num1 + num2);
        } else if (sign == '-') {
            System.out.println(num1 - num2);
        } else if (sign == '*') {
            System.out.println(num1 * num2);
        } else if (sign == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid input");
        }

    }
}
