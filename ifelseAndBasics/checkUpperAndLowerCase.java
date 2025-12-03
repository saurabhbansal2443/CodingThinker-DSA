package ifelseAndBasics;
import java.util.*;

public class checkUpperAndLowerCase {
    public static void main(String[] args) {
        // Write a program to check whether a
        // character is uppercase or lowercase.

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        // UpperCase - A(65) B(66) C(67)... -- Z(90)
        // LowerCase - a(97) b(98) c(99)... -- z(122)

        // (int)ch // typeCasting

        int DecCharacter = (int) ch; // converting to ascii value

        if (DecCharacter >= 65 && DecCharacter <= 90) { // upperCase
            System.out.println("UpperCase");
        } else if (DecCharacter >= 97 && DecCharacter <= 122) { // lowerCase
            System.out.println("LowerCase");
        } else {
            System.out.println("Enter a valid character ");
        }

    }
}
