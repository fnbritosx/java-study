package javamarathon.javacore.generics.domain;

public class Carro {
    private String name;

    public Carro(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
