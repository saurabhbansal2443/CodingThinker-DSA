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

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("The traingle is equilateral ");
        } else if (a == b || b == c || c == a) {
            System.out.println("The traingle is isosceles ");
        } else {
            System.out.println("The traingle is scalene ");
        }
        
    }
}
