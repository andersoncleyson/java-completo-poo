package estruturaCondicional;

public class FuncoesString {
    public static void main(String[] args) {
        String original = " Red Wheelbarrow ";
        String s01 = original.toLowerCase();

        System.out.println(original.toLowerCase());
        System.out.println(original.toUpperCase());
        System.out.println(original.trim());
        System.out.println(original.substring(2));
        System.out.println(original.replace("ee", "&&"));

        String s = "potato apple lemon";
        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
