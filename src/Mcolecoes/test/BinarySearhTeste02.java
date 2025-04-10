package Mcolecoes.test;

import Mcolecoes.test.dominio.Manga;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearhTeste02 {
    public static void main(String[] args) {
        MangaByComparator mangaByComparator = new MangaByComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(2L,"Attack on titan",55.7));
        mangas.add(new Manga(3L,"berserk",7.7));
        mangas.add(new Manga(6L,"Helssing Ultimate",49.7));
        mangas.add(new Manga(4L,"Dragon bal Z",85.7));
        //Collections.sort(mangas);
        mangas.sort(mangaByComparator);
        for (Manga manga : mangas){
            System.out.println(manga);
        }
        Manga mangaToSearch= new Manga(2L,"Dragon ball Z",2.99);
        System.out.println(Collections.binarySearch(mangas , mangaToSearch,mangaByComparator));
    }
}
