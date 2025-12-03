package ifelseAndBasics;
import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        // write a program to take input of a number
        // and check weather
        // it is a odd number or even number

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

    }
}
