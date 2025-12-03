package ifelseAndBasics;
import java.util.*;

public class IfElseIntro {
    public static void main(String[] args) {

        // make a program to take input from user of a number and print
        // weather it is negative positive or zero

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the number");

        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is a positive ");
        } else if (number < 0) {
            System.out.println("The number is negative ");
        } else {
            System.out.println("The number is Zero ");
        }
    }
}
