package Strings;

public class ReverseString {
    public static void main(String[] args) {
        // Write a Java program to reverse a given string.
        String str = "Hello I";

        String ans = reverse(str);

        System.out.println(ans);

    }

    public static String reverse(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            ans = ans + ch;
        }

        // TimeComlexity = O(n)
        // SpaceComplexity = O(n)

        return ans;
    }
}
