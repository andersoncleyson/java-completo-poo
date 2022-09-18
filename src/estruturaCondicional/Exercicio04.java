package estruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, horaTotal;

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if(horaInicial > horaFinal){
            horaTotal = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + horaTotal + " HORAS(S)");
        } else if(horaInicial == horaFinal){
            System.out.println("O JOGOU DUROU 24 HORAS");
        }else{
            horaTotal = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + horaTotal + " HORA(S)");
        }

        sc.close();
    }
}
