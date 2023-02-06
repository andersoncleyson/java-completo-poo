package estruturaCondicional;

public class ForEach {
    public static void main(String[] args) {
        String[] vect = new String[]{"Anderson", "Angela", "Darlene", "Shayla"};

        for(String nomes : vect){
            System.out.println(nomes);
        }
    }
}
