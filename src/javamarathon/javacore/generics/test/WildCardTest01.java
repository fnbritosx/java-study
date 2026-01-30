package javamarathon.javacore.generics.test;

import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public String toString() {
        return "Cachorro";
    }

    @Override
    public void consulta() { System.out.println("Consultando cachorro."); }
}

class Gato extends Animal {
    @Override
    public String toString() {
        return "Gato";
    }

    @Override
    public void consulta() { System.out.println("Consultando gato."); }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        // Mudar para List<Animal> resolve o erro porque o tipo da variável agora bate com o parâmetro do method.
        // MAS NÃO É INDICADO PORQUE:
        // 1. Perda de Semântica: Você diz que a lista é de "Animais", permitindo que alguém adicione um Gato na lista de Cachorros.
        // 2. Inflexibilidade: Na vida real, métodos de API/Banco geralmente retornam List<Cachorro>, e você não conseguiria usar seu printConsulta neles.
        List<Animal> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Animal> gatos = List.of(new Gato(), new Gato());

        // Agora compila, mas o custo foi "enfraquecer" a tipagem das suas listas no main.
        printConsulta(cachorros);
        printConsulta(gatos);
    }

    // Este method é "Invariante": ele aceita APENAS List<Animal>.
    // O ideal seria usar <? extends Animal> para que ele aceitasse List<Cachorro> sem forçar a mudança no main.
    private static void printConsulta(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}