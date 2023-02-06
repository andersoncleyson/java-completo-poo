package ExercicioExcecao;

import ExercicioExcecao.entities.Account;
import ExercicioExcecao.exceptions.BusinessExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Titular: ");
        String titular = sc.next();
        sc.next();
        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        System.out.print("Limite para saque: ");
        double limiteSaque = sc.nextDouble();

        Account conta = new Account(numero, titular, saldoInicial, limiteSaque);

        System.out.print("Informe uma quantia para sacar: ");
        double saque = sc.nextDouble();

        try{
            conta.withDraw(saque);
            System.out.println("Novo saldo: " + conta.getBalance());
        } catch (BusinessExceptions e){
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
