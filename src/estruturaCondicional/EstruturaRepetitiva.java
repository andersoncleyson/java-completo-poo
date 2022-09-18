package estruturaCondicional;

import java.util.Scanner;

public class EstruturaRepetitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 1;
        int somaNumeros = 0;

        while(numero > 0){
            numero = sc.nextInt();
            somaNumeros = somaNumeros + numero;
        }

        System.out.println("SOMA = " + somaNumeros);
        sc.close();
    }
}
