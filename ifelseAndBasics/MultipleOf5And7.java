package ifelseAndBasics;

public class MultipleOf5And7 {
    public static void main(String[] args) {
        // Write a Java program to check whether the
        // given integer is a multiple of 5 and 7

        int n = 45;

        // if (n % 5 == 0 && n % 7 == 0) {
        // System.out.println("yes");
        // } else {
        // System.out.println("No");
        // }

        if (n % 5 == 0) {
            if (n % 7 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
