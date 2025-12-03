package ifelseAndBasics;
import java.util.*;

public class YoungestOfThree {
    public static void main(String[] args) {
        // If the ages of Ram, Shyam and Ajay are input through the keyboard,
        // write a program to determine the youngest of the three

        Scanner sc = new Scanner(System.in);

        int ajay = sc.nextInt();
        int ram = sc.nextInt();
        int shyam = sc.nextInt();

        // ajay = 10 // ram == 15 // shyam == 9 // equal ages

        if (ajay < ram && ajay < shyam) {
            System.out.println("Ajay is youngest");
        } else if (shyam < ram && shyam < ajay) {
            System.out.println("Shyam is youngest");
        } else {
            System.err.println("Ram");
        }

    }
}
