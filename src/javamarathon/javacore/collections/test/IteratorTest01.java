package javamarathon.javacore.collections.test;

import javamarathon.javacore.collections.domain.Manga;

import java.util.*;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(4L, "Death note", 27.5, 0));
        mangas.add(new Manga(1L, "Attack on titan", 20.5, 5));
        mangas.add(new Manga(3L, "Berserker", 26.8, 0));
        mangas.add(new Manga(5L, "One piece", 28.5, 2));
        mangas.add(new Manga(2L, "Naruto", 25.7, 0));


        // ERRO: ConcurrentModificationException!
        // Não podemos remover itens diretamente de uma lista enquanto a percorremos com um for-each.
        // O Java usa um Iterator internamente e, ao modificar a lista diretamente, o Iterator perde o sincronismo com o estado atual da coleção.

//        for (Manga manga : mangas) {
//            if (manga.getQuantidade() == 0) {
//                mangas.remove(manga);
//            }
//        }

        Iterator<Manga> mangaIterator = mangas.iterator();

        // jeito antigo
//        while(mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        //jeito moderno
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);
    }
}
