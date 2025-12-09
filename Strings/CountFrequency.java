package Strings;

public class CountFrequency {
    public static void main(String[] args) {
        // Write a Java program to find the occurrence of a specific character in a
        // string.

        String str = "gdejhdjhebfjaaaaaaaaaaoiuouo";
        char ch = 'a';

        System.out.println(frequencyOfCharacter(str, ch));

    }

    public static int frequencyOfCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
