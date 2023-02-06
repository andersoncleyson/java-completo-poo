package IntroducaoPOO;

import IntroducaoPOO.entities.ConvertMoney;

import java.util.Locale;
import java.util.Scanner;

public class ConvertDollar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ConvertMoney money = new ConvertMoney();

        System.out.printf("What is the dollar price? ");
        money.dollarValue = sc.nextDouble();
        System.out.printf("How many dollars will be bougth? ");
        money.valueToConvert = sc.nextDouble();

        System.out.println(money);
        sc.close();


    }
}
