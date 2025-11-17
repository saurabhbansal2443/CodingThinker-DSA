package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) { // for row
            for (int col = 1; col <= row; col++) { // for col
                System.out.print(row + " ");
            }
            System.out.println(); // to change line
        }
    }
}
