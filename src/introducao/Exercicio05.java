package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca, numeroPecas;
        double valor, valorTotalPecas1, valorTotalPecas2, valorTotal;

        peca = sc.nextInt();
        numeroPecas = sc.nextInt();
        valor = sc.nextDouble();

        valorTotalPecas1 = valor * numeroPecas;

        peca = sc.nextInt();
        numeroPecas = sc.nextInt();
        valor = sc.nextDouble();

        valorTotalPecas2 = valor * numeroPecas;

        valorTotal = valorTotalPecas1 + valorTotalPecas2;


        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);


    }
}
