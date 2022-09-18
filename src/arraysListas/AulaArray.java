package arraysListas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AulaArray {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        for (int j = 0; j < vect.length; j++){
            System.out.printf("%.2f ", vect[j]);
        }

        System.out.println();
        double soma = Arrays.stream(vect).sum();

        double media = soma / n;

        System.out.println(soma);
        System.out.println("AVERAGE HEIGHT = " + String.format("%.2f", media));
        sc.close();
    }
}
