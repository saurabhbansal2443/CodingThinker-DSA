package ifelseAndBasics;
import java.util.*;

public class checkAlphabet {
    public static void main(String[] args) {
        // Write a program to check whether a
        // given character is an Alphabet or not.

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        int AsciiCharacter = (int) ch;

        if ((AsciiCharacter >= 65 && AsciiCharacter <= 90) ||
                (AsciiCharacter >= 97 && AsciiCharacter <= 122)) {

            System.out.println("This is a alphabet");

        } else {
            System.out.println("This is  Not a alphabet");
        }

    }
}
