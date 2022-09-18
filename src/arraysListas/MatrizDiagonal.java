package arraysListas;

import java.util.Scanner;

public class MatrizDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoMatris = sc.nextInt();

        int[][] matriz = new int[tamanhoMatris][tamanhoMatris];

        for(int i = 0; i < tamanhoMatris; i++){
            for(int j = 0; j < tamanhoMatris; j++){
                int valor = sc.nextInt();
                matriz[i][j] = valor;
            }
        }

        int numberNegative = 0;

        System.out.println("Main diagonal:");
        for(int i = 0; i < tamanhoMatris; i++){
            for(int j = 0; j < tamanhoMatris; j++){
                if(i == j){
                    System.out.printf("%d ", matriz[i][j]);
                }

                if(matriz[i][j] < 0){
                    numberNegative += 1;
                }
            }
        }
        System.out.println();
        System.out.printf("Negative numbers = " + numberNegative);

        sc.close();
    }
}
