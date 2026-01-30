package javamarathon.javacore.generics.test;

import javamarathon.javacore.collections.domain.Consumidor;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Fernando");
        list.add("Miguel");

        for (String s : list) System.out.println(s);

        add(list, new Consumidor("Eren"));

        // ClassCastException: O loop tenta converter Consumidor para String.
        // Isso ocorre porque Generics são apagados no runtime (Type Erasure)
        // e o method add usou Raw Type (List sem <>) para burlar o compilador.
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void add(List list, Consumidor consumidor){
        list.add(consumidor);
    }
}