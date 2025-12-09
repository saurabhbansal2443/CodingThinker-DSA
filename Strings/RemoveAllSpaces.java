package Strings;

public class RemoveAllSpaces {
    public static void main(String[] args) {
        // Write a Java program to remove all the spaces from a string.
        String str = "HEllo i am saurabh";

        String ans = removeSpaces(str);

        System.out.println(ans);
    }

    public static String removeSpaces(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                ans += ch;
            }
        }

        return ans;
    }
}
