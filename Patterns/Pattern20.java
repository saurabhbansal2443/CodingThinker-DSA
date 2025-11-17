package Patterns;

public class Pattern20 {
    public static void main(String[] args) {
        // Vertical Numbers
        int n = 9;

        for (int row = 1; row <= n; row++) {
            int print = row;
            int add = n;
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + print + " ");
                add--;
                print += add;
            }
            System.out.println();
        }
    }
}
