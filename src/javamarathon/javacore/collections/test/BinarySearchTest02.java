package javamarathon.javacore.collections.test;

import javamarathon.javacore.collections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(5);

        mangas.add(new Manga(4L, "Death note", 27.5));
        mangas.add(new Manga(5L, "A-One piece", 28.5));
        mangas.add(new Manga(1L, "Attack on titan", 20.5));
        mangas.add(new Manga(3L, "Berserker", 26.8));
        mangas.add(new Manga(2L, "Naruto", 25.7));

        mangas.sort(new mangaByIdComparator());

        System.out.println(mangas);
        Manga mangaForSearch = new Manga(10L, "One piece", 28.5);

        System.out.println(Collections.binarySearch(mangas, mangaForSearch, new mangaByIdComparator()));
    }
}
