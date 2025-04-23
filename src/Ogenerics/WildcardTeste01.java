package Ogenerics;

import java.util.List;

public class WildcardTeste01 {
    public static void main(String[] args) {

    }
    List<?> mochila;
        public void mostrarItens(List<?> lista) {
            for (Object item : lista) {
                System.out.println(item);
            }

    }
}
