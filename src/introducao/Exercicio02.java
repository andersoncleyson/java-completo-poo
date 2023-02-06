package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio;
        double area;

        System.out.println("-----VALOR DO RAIO DE UM CÍRCULO-----");
        System.out.printf("Digite o valor do raio: ");
        raio = sc.nextDouble();

        area = pi*Math.pow(raio, 2.0);

        System.out.printf("A = %.4f", area);


    }
}
