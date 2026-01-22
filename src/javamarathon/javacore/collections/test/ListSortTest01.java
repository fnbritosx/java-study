package javamarathon.javacore.collections.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();

        mangas.add("Attack on titan");
        mangas.add("Naruto");
        mangas.add("Berserker");
        mangas.add("Death note");
        mangas.add("One piece");


        System.out.println(mangas);

        Collections.sort(mangas);

        System.out.println(mangas);

    }
}
