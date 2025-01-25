package Iregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class teste02 {
    public static void main(String[] args) {
        String regex = "lu";
        String texto = "lululu";

        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:"+ texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex:"+ regex);
        System.out.println("posicoes encontradas: m");
        while(matcher.find()){
            System.out.print(matcher.start()+" ");
        }







    }
}
