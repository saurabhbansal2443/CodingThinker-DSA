package Patterns;

public class Pattern7 {
    public static void main(String[] args) {

        int n = 5;
        int nst = 1;
        int nsp = n - 1;

        for (int row = 1; row <= 2 * n - 1; row++) { // this is for row

            // for spaces
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print(" ");
            }
            // for stars
            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }

            System.out.println();

            if (row < n) {
                nsp--;
                nst++;
            } else {
                nsp++;
                nst--;
            }

        }
    }
}
