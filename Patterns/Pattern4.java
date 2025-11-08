package Patterns;

public class Pattern4 {
    public static void main(String[] args) {

        int n = 9;

        for (int row = 1; row <= n; row++) {
            // for printing space
            for (int sp = 1; sp <= (n - row); sp++) {
                System.out.print(" ");
            }
            // for printing stars
            for (int st = 1; st <= row; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
