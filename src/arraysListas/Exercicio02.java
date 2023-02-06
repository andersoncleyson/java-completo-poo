package arraysListas;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;

        System.out.printf("VALORES = ");
        for(int i = 0; i < vect.length; i++){
            System.out.printf("%.2f ", vect[i]);
            soma += vect[i];
        }

        System.out.println("");
        System.out.printf("SOMA = %.2f\n", soma);

        double media = soma / vect.length;

        System.out.printf("MEDIA = %.2f\n", media);


    }
}
