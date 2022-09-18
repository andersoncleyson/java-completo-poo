package IntroducaoPOO;

import IntroducaoPOO.entities.Triangule;

import java.util.Locale;
import java.util.Scanner;

public class MedidasTriangulo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangule x, y;
        x = new Triangule(); //instanciar - criar o objeto
        y = new Triangule(); //instanciar - criar o objeto

        System.out.println("Enter the measures of triangule X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter measures of triangule Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangule X area? %.4f%n", areaX);
        System.out.printf("Triangule Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
