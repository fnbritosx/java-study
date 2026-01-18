package javamarathon.javacore.classes.test;

import javamarathon.javacore.classes.domain.Student;

public class StudentTest2 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();

        student.name = "Yasuo";
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

        System.out.println("-----------------");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.sex);
    }
}
