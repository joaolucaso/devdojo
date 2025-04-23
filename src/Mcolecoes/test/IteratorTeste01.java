package Mcolecoes.test;

import Mcolecoes.test.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(2L, "Attack on titan", 55.7, 0));
        mangas.add(new Manga(3L, "berserk", 7.7, 5));
        mangas.add(new Manga(6L, "Helssing Ultimate", 49.7, 0));
        mangas.add(new Manga(4L, "Dragon bal Z", 85.7, 2));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();

            }
        }
    }
}
