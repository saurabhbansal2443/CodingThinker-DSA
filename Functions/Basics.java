package Functions;

public class Basics {
    public static void main(String[] args) { // Main function
        int c = 10;
        int d = 10;

        int sum = sum(c, d);
        System.out.println(sum);
    }

    public static void Greet() {
        System.out.println("GoodMorning");
    }

    public static int sum(int a, int b) {
        int sum = a + b;

        return sum;
    }

}
