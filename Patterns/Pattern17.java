package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        // S
        int n = 9;
        for (int i = 1; i <= n; i++) { // row
            for (int j = 1; j <= n; j++) { // columns
                if ((i == 1 && j >= n / 2 + 1) || (i == n / 2 + 1 && j >= n / 2 + 1) || (j == n / 2 + 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
