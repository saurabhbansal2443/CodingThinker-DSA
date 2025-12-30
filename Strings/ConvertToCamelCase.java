package Strings;

public class ConvertToCamelCase {
    public static void main(String[] args) {
        String str = "  Hello i   am saurabh bansal  ";// helloIAmSaurabhBansal

        String ans = convertCamelCase(str);

        System.out.println(ans);
    }

    public static String convertCamelCase(String str) { //"  Hello   i am saurabh bansal  "
        String ans = "";

        str = str.trim(); // to remove the start and end spaces

        char fc = str.charAt(0);

        if (fc >= 'A' && fc <= 'Z') {
            fc = (char) (fc - 'A' + 'a');
        }
        ans += fc;
        for (int i = 1; i < str.length(); i++) {
            char pre = str.charAt(i - 1);
            char curr = str.charAt(i);
            if (curr == ' ') {
                continue;
            } else if (pre == ' ' && curr >= 'a' && curr <= 'z') {
                curr = (char)(curr-'a'+'A'); 
            }
            ans += curr ; 
        }
        return ans;
    }
}
