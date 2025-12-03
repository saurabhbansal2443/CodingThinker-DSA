package ifelseAndBasics;
import java.util.*;

public class AreaOrPerimeter {
    public static void main(String[] args) {
        // You are given two integers that are the
        // length and breadth of the rectangle.
        // Check whether the area or perimeter is greater

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int bredth = sc.nextInt();

        int area = length * bredth;
        int perimeter = 2 * (length + bredth);

        if (area > perimeter) {
            System.out.println("Area is greater");
        } else if (area < perimeter) {
            System.out.println("Perimeter is greater");
        } else {
            System.out.println("Both area and perimter are equal");
        }

    }
}