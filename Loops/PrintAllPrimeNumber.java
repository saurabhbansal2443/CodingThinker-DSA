package Loops;

public class PrintAllPrimeNumber {
    public static void main(String[] args) {
        // Write a programme that asks the user to enter a number and then prints all
        // the prime numbers up to that number using a loop
        int a = 5;
        int b = 20;

        for (int i = a; i <= b; i++) {

            int n = i;
            boolean flag = true;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(n);
            }

        }

    }
}
