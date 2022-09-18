package TratamentoErros;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        method1();
        System.out.println("End of program");

    }

    public static void method1(){
        System.out.println("***METHOD START***");
        method2();
        System.out.println("***METHOD END***");
    }

    public static void method2(){
        System.out.println("***METHOD START***");
        Scanner sc = new Scanner(System.in);
        try{
            String[] vect = sc.nextLine().split(" ");
            int posistion = sc.nextInt();
            System.out.println(vect[posistion]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida");
            e.printStackTrace();
            sc.next();
        }catch (InputMismatchException e){
            System.out.println("Valor inválido para essa lista");
        }

        sc.close();
        System.out.println("***METHOD2 END****");
    }
}
