package introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Testes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String words = "cats AND*Dogs-are Awesome";

        Pattern pattern = Pattern.compile("\\W", Pattern.CASE_INSENSITIVE);
        String[] word = pattern.split(words);

        String palavra = "";

        for(int temp = 0; temp < word.length ; temp++){
            System.out.println(word[temp]);
            palavra += capitalizeWord(word[temp]);
        }
        System.out.println(word.length);
        System.out.println(palavra);

        String first = palavra.substring(0,1);
        first = first.toLowerCase();
        String afterFirst = palavra.substring(1);
        String wordCapitalized = first + afterFirst;

        System.out.println(wordCapitalized);

    }

    public static String capitalizeWord(String str){
        String words[]=str.split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst.toLowerCase()+" ";
        }
        return capitalizeWord.trim();
    }
}
