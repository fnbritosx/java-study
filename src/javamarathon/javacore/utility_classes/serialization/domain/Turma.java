package javamarathon.javacore.utility_classes.serialization.domain;

public class Turma  {
    private String name;

    public Turma(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "name='" + name + '\'' +
                '}';
    }
}
