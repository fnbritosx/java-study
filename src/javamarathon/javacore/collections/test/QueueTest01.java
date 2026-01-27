package javamarathon.javacore.collections.test;

import javamarathon.javacore.collections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator());

        mangas.add(new Manga(4L, "Death note", 27.5));
        mangas.add(new Manga(1L, "Attack on titan", 28.5));
        mangas.add(new Manga(3L, "Berserker", 26.8));
        mangas.add(new Manga(5L, "One piece", 28.5));
        mangas.add(new Manga(2L, "Naruto", 25.7));


        System.out.println(mangas);

        System.out.println("--------------");

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

        System.out.println("--------------");

        System.out.println(mangas);
    }
}
