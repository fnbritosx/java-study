package devbrito.marathonjava.javacore.introduction.classes.test;

import devbrito.marathonjava.javacore.introduction.classes.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Fernando";
        student.age = 19;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
