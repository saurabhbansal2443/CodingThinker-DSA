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
        StringBuilder longestWord = new StringBuilder();

        int idx = 0;
        int count = 0;
        StringBuilder word = new StringBuilder();

        while (idx < str.length()) {

            char ch = str.charAt(idx);

            if (ch == ' ') {
                if (max < count) {
                    max = count;
                    longestWord.replace(0, longestWord.length(), word.toString());
                }
                count = 0;
                word.delete(0, word.length());
            } else {
                word.append(ch);
                count++;
            }
            idx++;
        }
        if (max < count) {
            longestWord.replace(0, longestWord.length(), word.toString());
            max = count;
        }
        System.out.println(longestWord.toString());
        return max;
    }
}
