package Loops;

public class ReverseOfstring {
    public static void main(String[] args) {
        // Write a program that asks the user to enter a string and then prints the
        // reverse of that string using a loop.

        String str = "Hey I am Saurabh";

        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            ans = ans + ch;
        }
        System.out.println(ans);
    }
}
