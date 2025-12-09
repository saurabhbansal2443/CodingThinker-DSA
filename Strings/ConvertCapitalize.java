package Strings;

public class ConvertCapitalize {
    public static void main(String[] args) {
        // Write a Java program to convert the first letter of each word in a string to
        // uppercase.
        String str = "Hello i am Saurabh";
        System.out.println(convertCaptialaize(str));
    }

    public static String convertCaptialaize(String str) {
        String ans = "";

        char fc = str.charAt(0);

        if (fc >= 'a' && fc <= 'z') {
            fc = (char) (fc - 'a' + 'A');
        }
        ans += fc;

        for (int i = 1; i < str.length(); i++) {
            char pre = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (pre == ' ' && curr >= 'a' && curr <= 'z') {
                curr = (char) (curr - 'a' + 'A');
            }

            ans += curr;
        }
        return ans;
    }
}
