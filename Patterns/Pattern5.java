package Patterns;

public class Pattern5 {
    public static void main(String[] args) {

        int n = 5;

        // for row
        for (int row = 1; row <= n; row++) {
            // nsp
            for (int sp = 1; sp <= (row - 1); sp++) {
                System.out.print(" ");
            }
            // nst
            for (int st = 1; st <= (n + 1 - row); st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
