package ifelseAndBasics;
import java.util.*;

public class checkConsonantOrVowel {
    public static void main(String[] args) {
        // Write a program to input any alphabet
        // and check whether it is vowel or consonant

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        // vowel -> a,e,i ,o ,u

        // if (ch == 'a') {
        // System.out.println("It is a vowel");
        // } else if (ch == 'e') {
        // System.out.println("It is a vowel");
        // } else if (ch == 'i') {
        // System.out.println("It is a vowel");
        // } else if (ch == 'o') {
        // System.out.println("It is a vowel");
        // } else if (ch == 'u') {
        // System.out.println("It is a vowel");
        // } else if (ch == 'A') {
        // System.out.println("It is a vowel");
        // } else if (ch == 'E') {
        // System.out.println("It is a vowel");
        // } else if (ch == 'I') {
        // System.out.println("It is a vowel");
        // } else if (ch == 'O') {
        // System.out.println("It is a vowel");
        // } else if (ch == 'U') {
        // System.out.println("It is a vowel");
        // } else {
        // System.out.println("It is a consonant");
        // }

        // OR || operator

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a consonant");
        }

    }
}
