package javamarathon.javacore.collections.test;

import javamarathon.javacore.collections.domain.Consumidor;
import javamarathon.javacore.collections.domain.Manga;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        Consumidor consumidor01 = new Consumidor("Fernando");
        Consumidor consumidor02 = new Consumidor("Neto");

        Manga manga01 = new Manga(4L, "Death note", 27.5);
        Manga manga02 = new Manga(1L, "Attack on titan", 20.5);
        Manga manga03 = new Manga(3L, "Berserker", 26.8);
        Manga manga04 = new Manga(5L, "One piece", 28.5);
        Manga manga05 = new Manga(2L, "Naruto", 25.7);

        List<Manga> mangaList01 = new ArrayList<>(List.of(manga01, manga03, manga05));
        List<Manga> mangaList02 = new ArrayList<>(List.of(manga02, manga04));

        consumidorMangaMap.put(consumidor01, mangaList01);
        consumidorMangaMap.put(consumidor02, mangaList02);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + ": ");

            for (Manga manga : entry.getValue()){
                System.out.print(manga.getNome() + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
