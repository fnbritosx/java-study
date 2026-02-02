package javamarathon.javacore.generics.domain;

public class Moto {
    private String name;

    public Moto(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
