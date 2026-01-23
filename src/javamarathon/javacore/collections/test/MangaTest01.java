package javamarathon.javacore.collections.test;

import javamarathon.javacore.collections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class mangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(5);

        mangas.add(new Manga(4L, "Death note", 27.5));
        mangas.add(new Manga(1L, "Attack on titan", 20.5));
        mangas.add(new Manga(3L, "Berserker", 26.8));
        mangas.add(new Manga(5L, "One piece", 28.5));
        mangas.add(new Manga(2L, "Naruto", 25.7));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);

        System.out.println("---------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------");

        mangas.sort(new mangaByIdComparator());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
