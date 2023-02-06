package introducao;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int idade;
        double z;

        x = sc.next();
        idade = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados");
        System.out.println(x);
        System.out.println(idade);
        System.out.println(z);
        System.out.println();

        String s1, s2, s3;

        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        sc.close();

        System.out.println("Textos digitados");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
