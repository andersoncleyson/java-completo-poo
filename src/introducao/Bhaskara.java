package introducao;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args){
        System.out.println("----FORMULA DE BHASKARA----");
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        double delta;
        double x1, x2;

        System.out.printf("Digite o valor de a: ");
        a = sc.nextInt();
        System.out.printf("Digite o valor de b: ");
        b = sc.nextInt();
        System.out.printf("Digite o valor de c: ");
        c = sc.nextInt();

        delta = (int)Math.pow(b, 2.0) - 4*a*c;
        System.out.println("Valor Delta = " + delta);

        System.out.println("----------------------");

        x1 = (-b + Math.sqrt(delta)) / 2.0*a;
        x2 = (-b - Math.sqrt(delta)) / 2.0*a;

        System.out.printf("Raiz x1 = %.2f\n", x1);
        System.out.printf("Raiz x2 = %.2f\n", x2);




    }
}
