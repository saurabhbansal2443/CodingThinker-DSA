package Patterns;

public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            int print = 1;
            for (int col = 1; col <= nst; col++) {
                System.out.print(" " + print + " ");
                if (col <= nst / 2) {
                    print++;
                } else {
                    print--;
                }
            }
            nst += 2;
            System.out.println();
        }
    }
}
