package javamarathon.javacore.collections.test;

import javamarathon.javacore.collections.domain.Consumidor;
import javamarathon.javacore.collections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();

        Consumidor consumidor01 = new Consumidor("Fernando");
        Consumidor consumidor02 = new Consumidor("Neto");

        Manga manga01 = new Manga(1L, "Atack on Titan", 20);
        Manga manga02 = new Manga(5L, "One piece", 28.5);

        consumidorMangaMap.put(consumidor01, manga01);
        consumidorMangaMap.put(consumidor02, manga02);

        for (Map.Entry<Consumidor, Manga> mangaEntry : consumidorMangaMap.entrySet()) {
            System.out.println(mangaEntry.getKey().getNome() + " - " + mangaEntry.getValue().getNome());
        }
    }
}
