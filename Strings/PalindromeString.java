package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "rAdar";

        String lowerString = ToLowerCase(str);

        System.out.println(CheckPlaindrome(lowerString));

    }

    public static String ToLowerCase(String str) {
        if (str.length() == 0) {
            return str;
        }

        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ans += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                char convertedChar = (char) (ch - 'A' + 'a');// C-> 99 - 97 + 65 == 67 
                ans += convertedChar;
            } else {
                ans += ch;
            }
        }

        return ans;
    }

    public static boolean CheckPlaindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        boolean flag = true;

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char stCh = str.charAt(start);
            char edCh = str.charAt(end);

            if (stCh != edCh) {
                flag = false;
                break;
            }

            start++;
            end--;
        }

        return flag;
    }
}
