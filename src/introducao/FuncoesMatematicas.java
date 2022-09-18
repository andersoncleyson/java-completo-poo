package introducao;

public class FuncoesMatematicas {
    public static void main(String[] args){
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 3.0);

        System.out.println();
        System.out.println(x + " elavado a " + y + " = " + A);
        System.out.println(x + " elevado a 2.0 = " + B);
        System.out.println("5.0 elevado a 3.0 = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoludo de " + z + " = " + B);
    }
}
