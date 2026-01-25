package javamarathon.javacore.collections.test;

import javamarathon.javacore.collections.domain.Manga;
import javamarathon.javacore.collections.domain.Smartphone;

import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        //forma 1: implementando o Comparator<> caso não tenha acesso à classe.
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());

        Smartphone s1 = new Smartphone("123", "Samsung");
        Smartphone s2 = new Smartphone("123", "Samsung");
        Smartphone s3 = new Smartphone("123", "Apple");
        Smartphone s4 = new Smartphone("123", "Xiaomi");


        set.addAll(List.of(s1, s2, s3, s4));

        for (Smartphone smartphone : set) {
            System.out.println(smartphone);
        }

        System.out.println("-----------------------");

        //forma 2: utilizando o compareTo da própria classe.
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());

        mangas.add(new Manga(4L, "Death note", 27.5));
        mangas.add(new Manga(1L, "Attack on titan", 20.5));
        mangas.add(new Manga(3L, "Berserker", 26.8));
        mangas.add(new Manga(5L, "One piece", 28.5));
        mangas.add(new Manga(2L, "Naruto", 25.7));
        mangas.add(new Manga(2L, "Aarong", 25.7));
        mangas.add(new Manga(2L, "Aarong", 25.7));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----------------------");

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        Manga jujustu = new Manga(1L, "Jujustu Kaizen", 25.7);

        System.out.println(mangas.lower(jujustu));
        System.out.println(mangas.floor(jujustu));
        System.out.println(mangas.higher(jujustu));
        System.out.println(mangas.ceiling(jujustu));

        System.out.println("---------------");


        // pollFirst - remove o primeiro item do Set
        // poolLast - remove o último item do Set

        mangas.pollFirst();
        mangas.pollLast();

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
