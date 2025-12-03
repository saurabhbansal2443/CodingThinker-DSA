package ifelseAndBasics;
public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        // Write a Java program to find days in a
        // month (Take input of Year and month number)

        int month = 2;
        int year = 2004;

        // 31 Days --> 1,3,5,7,8,10,12
        // 30 Days --> 4,6,9,11
        // 28 - 29 Days -2- febuary

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 Days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Days");
        } else if (month == 2 && year % 4 == 0) { // leap year
            System.out.println("29 Days");
        } else if (month == 2 && year % 4 != 0) { // non-leap year
            System.out.println("28 Days");
        } else {
            System.out.println("Enter a valid month number ");
        }
    }
}
