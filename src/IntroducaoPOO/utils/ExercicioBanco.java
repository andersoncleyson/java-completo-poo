package IntroducaoPOO.utils;

import IntroducaoPOO.entities.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBanco {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter account holder: ");
        String nomeTitular = sc.nextLine();

        double valorDeposito = 0;
        System.out.printf("Is there initial deposito (y/N)? ");
        char opcao = sc.nextLine().charAt(0);

        if(opcao == 'y' || opcao == 'Y'){
            System.out.printf("Enter initial deposit value: ");
            valorDeposito = sc.nextDouble();
        } else if(opcao == 'n' || opcao == 'N'){
            System.out.println("Tudo bem...");
        } else {
            System.out.println("Opcão inválida");
        }

        ContaBanco conta = new ContaBanco(numeroConta, nomeTitular, valorDeposito);

        System.out.println();
        System.out.println("Account data:");
        System.out.println(conta);

        System.out.println();

        System.out.printf("Enter a deposit value: ");
        valorDeposito = sc.nextDouble();
        conta.depositarValor(valorDeposito);
        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.println();

        System.out.printf("Enter a withdraw value: ");
        double saqueValor = sc.nextDouble();
        conta.sacarValor(saqueValor);
        System.out.println("Updated account data:");
        System.out.println(conta);

        sc.close();

    }
}
