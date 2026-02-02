package javamarathon.javacore.internalclasses.test;

import javamarathon.javacore.generics.domain.Moto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassTest01 {
    public static void main(String[] args) {
        List<Moto> motos = new ArrayList<>(List.of(new Moto("Honda"), new Moto("Yamaha"),
                new Moto("Suziki"), new Moto("Kawasaki"), new Moto("Hayabusa")));

        System.out.println("Antes: ");
        System.out.println(motos);

        System.out.println("---------------");

        // form 01
//        motos.sort(new Comparator<Moto>() {
//            @Override
//            public int compare(Moto o1, Moto o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        // form 2
//        motos.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        //form 03
        motos.sort(Comparator.comparing(Moto::getName));


        System.out.println("Depois: ");
        System.out.println(motos);
    }




}

