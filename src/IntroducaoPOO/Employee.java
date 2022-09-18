package IntroducaoPOO;

import IntroducaoPOO.entities.Salary;

import java.util.Locale;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salary salary = new Salary();

        System.out.printf("Name: ");
        salary.name = sc.nextLine();
        System.out.printf("Gross salary: ");
        salary.grossSalary = sc.nextDouble();
        System.out.printf("Tax: ");
        salary.tax = sc.nextDouble();

        System.out.println("Employee: " + salary.name + ", $ " + salary.netSalary());

        System.out.println();
        System.out.printf("Which percentage to increase salary? ");
        double percetage = sc.nextDouble();
        salary.increaseSalary(percetage);

        System.out.println();
        System.out.println(salary);

        sc.close();
    }
}
