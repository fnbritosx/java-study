package devbrito.marathonjava.javacore.association.domain;

public class StudentSeminar {
    private String name;
    private int age;
    private Seminar seminar;

    public StudentSeminar(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
