package introducao;

import java.util.Locale;

public class HelloFriend {
    public static void main(String[] args){
        System.out.println("Hello, friend");
        double x = 10.43432;
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
    }
}
