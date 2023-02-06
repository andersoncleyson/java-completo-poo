package estruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, multiplo;

        numero1 = sc.nextInt();
        numero2 = sc.nextInt();


        if(numero1 < numero2){
            multiplo = numero2 % numero1;
            if (multiplo > 0){
                System.out.println("Nao sao Multiplos");
            }else{
                System.out.println("Sao Multiplos");
            }
        }else{
            multiplo = numero1 % numero2;
            if(multiplo == 0){
                System.out.println("Sao Multiplos");
            }else {
                System.out.println("Nao sao Multiplos");
            }
        }

        sc.close();
    }
}
