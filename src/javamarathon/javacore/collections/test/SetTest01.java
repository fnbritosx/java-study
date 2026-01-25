package javamarathon.javacore.collections.test;

import javamarathon.javacore.collections.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(4L, "Death note", 27.5, 0));
        mangas.add(new Manga(1L, "Attack on titan", 20.5, 5));
        mangas.add(new Manga(3L, "Berserker", 26.8, 0));
        mangas.add(new Manga(5L, "One piece", 28.5, 2));
        mangas.add(new Manga(2L, "Naruto", 25.7, 0));
        mangas.add(new Manga(2L, "Naruto", 25.7, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
