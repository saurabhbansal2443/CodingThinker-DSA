package Strings;

public class CompressTheString {
    public static void main(String[] args) {
        // Substring
        String str = "aaaaaabbbbbbbbcccccdeeeeeefghijjjj"; // "a6b8c5de6fghij4"

    }

    public static void compress(String str) {
        String ans = "";

        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);

            if (curr == pre) {
                count++;
            } else {
                ans += pre;
                if (count > 1) {
                    ans += count;
                }
                count = 1;
            }
        }
        ans += str.charAt(str.length() - 1);
        if (count > 1) {
            ans += count;
        }

        System.out.println(ans);
    }

    public static void compressSb(String str) {
        StringBuilder sb = new StringBuilder();

        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);

            if (curr == pre) {
                count++;
            } else {
                sb.append(pre);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1));
        if (count > 1) {
            sb.append(count);
        }

        System.out.println(sb.toString());
    }
}
