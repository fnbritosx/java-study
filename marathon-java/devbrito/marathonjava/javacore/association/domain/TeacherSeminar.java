package devbrito.marathonjava.javacore.association.domain;

import java.util.ArrayList;
import java.util.List;

public class TeacherSeminar {
    private String name;
    private String specialty;
    private List<Seminar> seminar = new ArrayList<>();

    public TeacherSeminar(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public TeacherSeminar(String name, String specialty, List<Seminar> seminar) {
        this.name = name;
        this.specialty = specialty;
        this.seminar = seminar;
    }

    public String getName(){
        return name;
    }

    public void setSeminar(List<Seminar> seminar){
        this.seminar = seminar;
    }
}
