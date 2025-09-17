import java.util.*;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of num1 ");

        int num1 = sc.nextInt(); // way to take the input of integer

        System.out.println("Enter the value of string ");

        String str = sc.next(); // way to take the input of string

        System.out.println("Enter a double value");

        double db = sc.nextDouble();// way to take the input of double

        System.out.println("Enter the value of character ");

        char ch = sc.next().charAt(0); // way to take the input of character

        System.out.println("ch   " + ch);

    }
}
