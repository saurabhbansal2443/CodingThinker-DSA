package ifelseAndBasics;
import java.util.*;

public class checkTriangle {
    public static void main(String[] args) {
        // Write a program to check whether the triangle is
        // equilateral, isosceles or scalene triangle

        // triangle -- 3 sides

        // Eqilateral - 3 sides are equal
        // Iossceles - 2 sides are equal
        // scalene - all sides are unequal

        Scanner sc = new Scanner(System.in);

        // Homerwork to do this question without using && and || operator

        // a 10 10 12 10 12 20 9 20
        // b 9 10 12 12 10 25 6 22
        // c 8 10 10 12 12 10 5 20

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // if (a == b && b == c) {
        // System.out.println("The traingle is equilateral ");
        // } else if (a == b || b == c || c == a) {
        // System.out.println("The traingle is isosceles ");
        // } else {
        // System.out.println("The traingle is scalene ");
        // }

        if (a == b) {
            if (a == c) {
                System.out.println("Equilateral");
            } else {
                System.out.println("isosceles");
            }
        } else if (a == c) {
            System.out.println("isosceles");
        } else if (b == c) {
            System.out.println("isosceles");
        } else {
            System.out.println("The traingle is scalene ");
        }

    }
}
