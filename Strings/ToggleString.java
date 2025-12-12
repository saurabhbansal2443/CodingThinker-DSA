package Strings;

public class ToggleString {
    public static void main(String[] args) {
        // Toggle a string that is make uppercase to lowercase and lowercase to
        // uppercase
        String str = "mY NaME iS SauRABH bAnSaL";
        String ans = toggle(str);
        System.out.println(ans);
    }

    public static String toggle(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ans = ans + (char) (ch - 'a' + 'A');
            } else if (ch >= 'A' && ch <= 'Z') {
                ans = ans + (char) (ch - 'A' + 'a');
            } else {
                ans = ans + ch;
            }
        }

        return ans;
    }
}
