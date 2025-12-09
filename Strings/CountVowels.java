package Strings;

public class CountVowels {
    public static void main(String[] args) {
        // Write a Java program to count the number of vowels in a string.

        String str = "Hello I am java code";

        int vowels = countVowels(str);

        System.out.println(vowels);

    }

    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }
}
