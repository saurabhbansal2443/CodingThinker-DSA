package Patterns;

public class Pattern6 {
    public static void main(String[] args) {

        int n = 5;
        int nst = 1;

        // row
        for (int row = 1; row <= (2 * n - 1); row++) {
            // for priniting stars in row
            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }
            System.out.println();
            if (row < n) {
                nst++;
            } else {
                nst--;
            }
        }
    }
}
