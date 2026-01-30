package javamarathon.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        // 1. Criamos uma lista de OBJECT (a superclasse de Animal)
        // Ela já começa com uma String lá dentro.
        List<Object> listaDeTudo = new ArrayList<>();
        listaDeTudo.add("Eu sou uma String e já estava aqui!");

        // 2. Chamamos o method passando essa lista de Objects.
        // O Java ACEITA porque Object é "super" de Animal.
        adicionarAnimais(listaDeTudo);

        // 3. Vamos ver o que tem na lista agora
        System.out.println("Conteúdo da lista após o método:");
        for (Object o : listaDeTudo) {
            System.out.println("- " + o.toString());
        }
    }

    // O segredo está aqui: ? super Animal
    // Ele diz: "Pode vir List<Animal> ou List<Object>"
    private static void adicionarAnimais(List<? super Animal> lista) {
        // Eu consigo adicionar um Cachorro? SIM!
        // Porque Cachorro é Animal e Animal cabe em Object.
        lista.add(new Cachorro());

        // Eu consigo adicionar um Gato? SIM!
        lista.add(new Gato());

        // Eu conseguiria adicionar um new Object() aqui? NÃO!
        // Porque se a lista que veio fosse de Animal, o Object não caberia.

    }
}