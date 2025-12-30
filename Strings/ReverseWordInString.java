package Strings;

public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "Hello I hate coding"; // "olleH I etah gnidoc"

        String ans = reverseWords(str);

        System.out.println(ans);

    }

    public static String reverseWords(String str) {
        String ans = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                temp += ch;
            } else {
                String tempReverse = reverse(temp);
                ans += tempReverse + ch;
                temp = "";
            }
        }
        if (temp.length() > 0) {
            String tempReverse = reverse(temp);
            ans += tempReverse;
        }
        return ans;
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

        return ans;
    }
}