package javamarathon.javacore.association.domain;

public class TeacherSeminar {
    private String name;
    private String specialty;
    private Seminar seminar;

    public TeacherSeminar(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public void teacherPrinter(){
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("Seminar: " + seminar.getTitle());
    }
    public TeacherSeminar(String name, String specialty, Seminar seminar) {
        this.name = name;
        this.specialty = specialty;
        this.seminar = seminar;
    }

    public String getName(){
        return name;
    }

    public void setSeminar(Seminar seminar){
        this.seminar = seminar;
    }
}
