package introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Teste05 {
    public static String ArrayChallange(String[] strArr){
        List<String> lista = new ArrayList<>();
        lista.add(strArr[0]);
        String[] teste = strArr[1].split(",", 10);
        for(int i = 0; i < teste.length; i++){
            System.out.println(teste[i]);
        }
        return lista.get(0);
    }

    public static void main(String[] args) {
        System.out.println(ArrayChallange(new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,o"}));
    }
}
