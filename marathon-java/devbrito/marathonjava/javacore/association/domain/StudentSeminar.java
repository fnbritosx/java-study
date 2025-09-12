package devbrito.marathonjava.javacore.association.domain;

public class StudentSeminar {
    private String name;
    private int age;
    private Seminar seminar;

    public StudentSeminar(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void studentPrinter(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Seminars: " + seminar.getTitle());
    }

    public String getName() {
        return name;
    }
    public void setSeminar(Seminar seminar){
        this.seminar = seminar;
    }
}
