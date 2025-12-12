package Strings;

public class RemoveDupliacte {
    public static void main(String[] args) {
        // Write a Java program to remove duplicate characters from a string.
        String str = "aaaabcddddddddefghiiiiiiiiii";
        String ans = remove(str);
        System.out.println(ans);
    }

    public static String remove(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        String ans = "";

        ans += str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);
            if (prev != curr) {
                ans += curr;
            }
        }

        return ans;
    }
}
