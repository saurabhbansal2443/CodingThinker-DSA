import java.util.*;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");

        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + "is a positive number");
        } else if (number < 0) {
            System.out.println(number + "is a negative number");
        } else {
            System.out.println(number + "is a zero");
        }

    }
}