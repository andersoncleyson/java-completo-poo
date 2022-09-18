package arraysListas;

import arraysListas.entities.AlunosAltura;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        AlunosAltura[] vect = new AlunosAltura[n];

        int ordem = 1;

        for (int i = 0; i < vect.length; i++){

            System.out.println("Dados da " + ordem + "a pessoa:");

            System.out.printf("Nome: ");
            String nome = sc.next();

            System.out.printf("Idade: ");
            int idade = sc.nextInt();

            System.out.printf("Altura ");
            double altura = sc.nextDouble();

            vect[i] = new AlunosAltura(nome, idade, altura);

            ordem += 1;
        }

        double somaAltura = 0.0;

        for(int i = 0; i < vect.length; i++){
            somaAltura += vect[i].getAltura();
        }

        double mediaAltura = somaAltura / vect.length;

        double alunosMenorDezesseis = 0;

        for(int i = 0; i < vect.length; i++){
            if (vect[i].getIdade() < 16) {
                alunosMenorDezesseis += 1;
            }
        }

        double alunosMenor = (alunosMenorDezesseis / vect.length) * 100;

        System.out.println();

        System.out.printf("Altura média %.2f\n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.2f\n", alunosMenor, "%");

        for(int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
