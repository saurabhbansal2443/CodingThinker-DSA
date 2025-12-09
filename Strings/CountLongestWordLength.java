package Strings;

public class CountLongestWordLength {
    public static void main(String[] args) {
        // Write a Java program to find the length of the longest word in a string

        String str = "HEllo i am saurabh";

        int maxLength = countMaxLength(str);

        System.out.println(maxLength);
    }

    public static int countMaxLength(String str) {
        int max = 0;
        String longestWord = "";

        int idx = 0;
        int count = 0;
        String word = "";

        while (idx < str.length()) {

            char ch = str.charAt(idx);

            if (ch == ' ') {
                if (max < count) {
                    max = count;
                    longestWord = word;
                }
                count = 0;
                word = "";
            } else {
                word = word + ch;
                count++;
            }
            idx++;
        }
        if (max < count) {
            longestWord = word;
            max = count;
        }
        System.out.println(longestWord);
        return max;
    }
}
