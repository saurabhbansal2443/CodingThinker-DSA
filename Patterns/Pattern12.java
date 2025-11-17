package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        // int n = 21;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= n; j++) {
        // if ((i == 1 && j <= n / 2 + 1) || (i == n / 2 + 1) || (i == n && j > n / 2 +
        // 1)
        // || (j == 1 && i >= n / 2 + 1) || (j == n / 2 + 1) || (j == n && i < n / 2 +
        // 1)) {
        // System.out.print(" * ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        int n = 11;
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= (n - row); sp++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }
            nst = nst + 2;
            System.out.println();
        }
    }
}
