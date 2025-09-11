package devbrito.marathonjava.javacore.association.domain;

public class TeacherSeminar {
    private String name;
    private String specialty;
    private Seminar[] seminar;

    public TeacherSeminar(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public TeacherSeminar(String name, String specialty, Seminar[] seminar) {
        this.name = name;
        this.specialty = specialty;
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public Seminar[] getSeminar() {
        return seminar;
    }
}
