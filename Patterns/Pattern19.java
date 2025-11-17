package Patterns;

public class Pattern19 {
    public static void main(String[] args) {
        // Sand Clock
        int n = 9;
        for (int i = 1; i <= n; i++) { // row
            for (int j = 1; j <= n; j++) { // columns
                if (i == 1 || i == n || i == j || i + j == n + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
