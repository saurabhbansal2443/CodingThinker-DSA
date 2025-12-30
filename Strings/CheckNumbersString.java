package Strings;

public class CheckNumbersString {
    public static void main(String[] args) {
        // Write a Java program to check if a string contains only digits.
        String str = "987654321";

        System.out.println(checkNumbersString(str));

    }

    public static boolean checkNumbersString(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if (ch < '0' || ch > '9') { //Ist way
            // return false;
            // }

            if (ch >= '0' && ch <= '9') { // IInd way 
            } else {
                return false;
            }
        }

        return true;

    }
}
