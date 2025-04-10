package Mcolecoes.test;

import Mcolecoes.test.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LisSortingTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("berserk");
        mangas.add("Helssing Ultimate");
        mangas.add("Dragon bal Z");

        Collections.sort(mangas);




    }
}
