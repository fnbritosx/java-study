package javamarathon.javacore.methods.domain;

public class ShowStudent {
    public void show(Student student) {
        System.out.println("---------------");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
