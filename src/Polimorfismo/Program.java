package Polimorfismo;

import Polimorfismo.entities.Employee;
import Polimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char option = sc.next().charAt(0);
            if (option == 'n'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valueHour = sc.nextDouble();

                //Employee employee = new Employee(name, hours, valueHour);
                list.add(new Employee(name, hours, valueHour));


            } else if (option == 'y'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valueHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();

                //OutsourcedEmployee employee = new OutsourcedEmployee(name, hours, valueHour, additionalCharge);
                list.add(new OutsourcedEmployee(name, hours, valueHour, additionalCharge));
            } else{
                System.out.println("Opção inválida");
                System.out.println();
                i -= 1;
            }

        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee employee : list){
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

        sc.close();
    }
}
