package ifelseAndBasics;
import java.util.*;

public class ValidAngles {
    public static void main(String[] args) {
        // Write a program to input all angles of a triangle
        // and check whether it is valid or not

        Scanner sc = new Scanner(System.in);

        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        
        int sum = angle1 + angle2 + angle3;
        if (sum == 180) {
            System.out.println("This is a valid triangle");
        } else {
            System.out.println("This is not a valid triangle");
        }
    }
}
