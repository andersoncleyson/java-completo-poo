package heranca;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Anderson", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "MAria", 0.0, 500.00);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bib", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        Account abb1 = new Account(1001, "Shayla", 1000.00);
        abb1.withDraw(200.0);
        System.out.println(abb1.getBalance());

        Account abb2 = new SavingsAccount(1003, "Angela", 1000.00, 0.01);
        abb2.withDraw(200);
        System.out.println(abb2.getBalance());

        Account abb3 = new BusinessAccount(1005, "Elliot", 1000.00, 500.00);
        abb3.withDraw(200.00);
        System.out.println(abb3.getBalance());

        //char chars[]={'c','o','d','e'};
        //String s = new String(chars);
        //System.out.println(s);

        // POLIMORFISMO
        Account x = new Account(1029, "Anderson", 1000.00);
        Account y = new SavingsAccount(1028, "Maria", 1000.00, 0.01);

        x.withDraw(50.0);
        y.withDraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

        Account add1 = new Account(1001, "Alex", 1000.00);
        Account add2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
        Account add3 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);




    }
}
