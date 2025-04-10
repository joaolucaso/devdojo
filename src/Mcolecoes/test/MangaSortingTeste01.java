package Mcolecoes.test;

import Mcolecoes.test.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class MangaByComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}
public class MangaSortingTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(2L,"Attack on titan",55.7));
        mangas.add(new Manga(3L,"berserk",7.7));
        mangas.add(new Manga(6L,"Helssing Ultimate",49.7));
        mangas.add(new Manga(4L,"Dragon bal Z",85.7));
        for (Manga manga : mangas){
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("--------------------");
        for (Manga manga : mangas){
            System.out.println(manga);
        }
        Collections.sort(mangas,new MangaByComparator());
        System.out.println("--------------------");
        for (Manga manga : mangas){
            System.out.println("---------------------");
        }


    }
}
