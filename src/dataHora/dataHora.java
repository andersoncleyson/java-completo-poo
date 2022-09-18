package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dataHora {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //instanciar
        LocalDate d01 = LocalDate.now(); // método estático
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-08-24");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:40:50");
        //Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        //Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("24/08/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 8, 30);

        //Convertendo data-hora para texto

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d04 = " + d09.format(fmt3));

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("d05 = " + d05.format(fmt4));

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        //System.out.println(d06);
        //System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
    }
}
