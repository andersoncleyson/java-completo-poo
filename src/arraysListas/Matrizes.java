package arraysListas;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        int[][] matrizMulti = new int[linha][coluna];
        int valor = 0;

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                valor = sc.nextInt();
                matrizMulti[i][j] = valor;
            }
        }

        for (int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.printf("%d ", matrizMulti[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");

        int encontrarValor = sc.nextInt();

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                if(encontrarValor == matrizMulti[i][j]){
                    System.out.printf("Position: %d %d\n", i, j);
                    if (!(j - 1 < 0)){
                        System.out.println("Left: " + matrizMulti[i][j - 1]);
                    }

                    if(!(i - 1 < 0)){
                        System.out.println("Up: " + matrizMulti[i - 1][j]);
                    }

                    if(!(j + 1 > coluna - 1)){
                        System.out.println("Right: " + matrizMulti[i][j + 1]);
                    }

                    if(!(i + 1 > linha - 1)){
                        System.out.println("Down: " + matrizMulti[i + 1][j]);
                    }
                }
            }
        }
    }
}
