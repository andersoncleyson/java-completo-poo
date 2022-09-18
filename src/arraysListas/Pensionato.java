package arraysListas;

import arraysListas.entities.Quartos;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Quartos[] vect = new Quartos[9];

        System.out.printf("How many rooms will be rented? ");
        int nAlunos = sc.nextInt();

        for (int i = 0; i < nAlunos; i++){
            sc.nextLine();
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Email: ");
            String email = sc.nextLine();
            System.out.printf("Room: ");
            int numeroQuarto = sc.nextInt();

            vect[numeroQuarto] = new Quartos(name, email, numeroQuarto);
            System.out.println();

        }

        System.out.println("Busy rooms: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] != null){
                System.out.println(vect[i].toString());
            }
        }

        sc.close();
    }
}
