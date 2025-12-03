package ifelseAndBasics;
import java.util.*;

public class Salary {
    public static void main(String[] args) {
        // Write a program to input basic salary of an employee and
        // calculate its Gross salary according to following:
        // Basic Salary <= 10000: HRA = 20%, DA = 80%
        // Basic Salary <= 20000: HRA = 25%, DA = 90%
        // Basic Salary > 20,000: HRA = 30%, DA = 95%
        // Hint -> Gross Salary = basic Salary + HRA + DA

        Scanner sc = new Scanner(System.in);

        int basicSalary = sc.nextInt();

        double grossSalary = 0;

        if (basicSalary <= 10000) {

            double hra = (double) 0.2 * basicSalary;
            double da = (double) 0.8 * basicSalary;

            grossSalary = basicSalary + hra + da;

        } else if (basicSalary <= 20000) {
            double hra = (double) 0.25 * basicSalary;
            double da = (double) 0.9 * basicSalary;

            grossSalary = basicSalary + hra + da;

        } else {
            double hra = (double) 0.3 * basicSalary;
            double da = (double) 0.95 * basicSalary;

            grossSalary = basicSalary + hra + da;
        }

        System.out.println(grossSalary);

    }
}
