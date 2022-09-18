package ImpostoCalculo;

import ImpostoCalculo.entities.PessoaFisica;
import ImpostoCalculo.entities.PessoaJuridica;
import ImpostoCalculo.entities.Receita;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Receita> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int nPayers = sc.nextInt();

        String name;
        double rendaAnual;
        double gastoSaude;
        int numeroFuncionarios;

        for(int i = 0; i < nPayers; i++){
            System.out.println("Tax payer #" + (i+1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char opcao = sc.next().charAt(0);

            if(opcao == 'i'){
                System.out.print("Name: ");
                name = sc.next();
                System.out.print("Anual income: ");
                rendaAnual = sc.nextDouble();
                System.out.print("Health expenditures: ");
                gastoSaude = sc.nextDouble();

                list.add(new PessoaFisica(name, rendaAnual, gastoSaude));

            } else if(opcao == 'c'){
                System.out.print("Name: ");
                name = sc.next();
                System.out.print("Anual income: ");
                rendaAnual = sc.nextDouble();
                System.out.print("Number of emplyees: ");
                numeroFuncionarios = sc.nextInt();

                list.add(new PessoaJuridica(name, rendaAnual, numeroFuncionarios));
            } else {
                System.out.println("OPÇÃO INVÁLIDA");
                i -= 1;
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        double total = 0;
        for(Receita contribuinte : list){
            System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", contribuinte.calculoImposto()));
            total += contribuinte.calculoImposto();
        }

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));
    }
}
