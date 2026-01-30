package javamarathon.javacore.generics.test;

import javamarathon.javacore.generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Porshe");
        Carro carro01 = new Carro("Mitsubish");

        List<Carro> carros = addItemInList(carro, carro01);

        System.out.println(carros);
    }

    public static <T> List<T> addItemInList(T... t) {

        return new ArrayList<>(List.of(t));
    }
}
