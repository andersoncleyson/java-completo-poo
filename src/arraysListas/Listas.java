package arraysListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Anderson");
        list.add("Angela");
        list.add("Darlene");
        list.add("Elliot");

        list.add(2, "Leon");

        System.out.println(list.size());

        for(String nomes : list){
            System.out.println(nomes);
        }

        System.out.println("-------------");
        list.removeIf(x -> x.charAt(0) == 'A');

        for(String nomes : list){
            System.out.println(nomes);
        }

        System.out.println("-------------");
        System.out.println("Index of Leon: " + list.indexOf("Leon"));
        System.out.println("Index of Anderson: " + list.indexOf("Anderson"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
        for(String names : result){
            System.out.println(names);
        }

        System.out.println("-------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
        System.out.println(name);

        String exemplo = "asdfg";
        System.out.println(exemplo.length());
    }
}
