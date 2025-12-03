package ifelseAndBasics;
import java.util.*;

public class PurchasingAnItem {
    public static void main(String[] args) {

        // When purchasing certain items, a discount of 10% is offered
        // if the quantity purchased is more than 100.
        // If quantity and price per item are input through the keyboard,
        // write a program to calculate the total expenses

        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int quantity = sc.nextInt();

        if (quantity > 100) { // 10% discount

            int expenses = price * quantity;
            double discount = (double) 0.1 * expenses;

            double totalExpense = expenses - discount;

            System.out.println("Total Expense " + totalExpense);

        } else { // no discount

            double totalExpense = price * quantity;

            System.out.println("Total Expense " + totalExpense);
        }

    }
}
