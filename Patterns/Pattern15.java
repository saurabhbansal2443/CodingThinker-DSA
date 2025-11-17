package Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = 0;
        int nst = 2 * n - 1;
        for (int row = 1; row <= n; row++) { // for rows
            // spaces
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print(" ");
            }
            // stars
            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }
            System.out.println();
            nsp++;
            nst -= 2;
        }
    }
}
