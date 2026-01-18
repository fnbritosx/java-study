package javamarathon.javacore.methods.test;
import javamarathon.javacore.methods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01= new Student();
        Student student02 = new Student();

        student01.name = "Fernando";
        student01.age = 19;
        student01.sex = 'M';

        student02.name = "Miguel";
        student02.age = 14;
        student02.sex = 'M';

        student01.write();
        student02.write();
    }
}
