package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double preco, total;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if(codigo == 1){
            preco = 4.00;
            System.out.printf("1 CACHORRO QUENTE - R$ %.2f quantidade - %d\n", preco, quantidade);
            total = preco * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        } else if(codigo == 2){
            preco = 4.50;
            System.out.printf("2 X-SALADA - R$ %.2f quantidade - %d\n", preco, quantidade);
            total = preco * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        } else if(codigo == 3){
            preco = 5.00;
            System.out.printf("3 X-BACON - R$ %.2f quantidade - %d\n", preco, quantidade);
            total = preco * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        } else if(codigo == 4){
            preco = 2.00;
            System.out.printf("4 Torrada simples - R$ %.2f quantidade - %d\n", preco, quantidade);
            total = preco * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        } else if(codigo == 5){
            preco = 1.50;
            System.out.printf("5 Refrigerante - R$ %.2f quantidade - %d\n", preco, quantidade);
            total = preco * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        } else{
            System.out.println("Produto inexistente");
        }

        sc.close();
    }
}
