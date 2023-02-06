package introducao;

import java.util.Scanner;

public class FuncaoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int n = sc.nextInt();
        System.out.println("O valor desse numero na sequencia de Fibonacci = " + fibonacci(n));
    }

    public static long fibonacci(long x){
        if (x == 0){
            return x;
        }

        long last = 0;
        long next = 1;
        long aux = 1;

        for(int i = 1; i < x; i++){
            aux = last + next;
            last = next;
            next = aux;
            System.out.println(next);
        }

        return next;
    }
}
