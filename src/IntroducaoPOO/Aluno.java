package IntroducaoPOO;

import IntroducaoPOO.entities.MediaNotas;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        MediaNotas notas = new MediaNotas();

        notas.name = sc.nextLine();
        notas.nota1 = sc.nextDouble();
        notas.nota2 = sc.nextDouble();
        notas.nota3 = sc.nextDouble();

        notas.notaMedia();

        System.out.println(notas);

    }
}
