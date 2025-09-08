package devbrito.marathonjava.javacore.methods.test;

import devbrito.marathonjava.javacore.methods.domain.ShowStudent;
import devbrito.marathonjava.javacore.methods.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        ShowStudent show = new ShowStudent();

        student01.name = "Fernando";
        student01.age = 19;
        student01.sex = 'M';

        student02.name = "Miguel";
        student02.age = 14;
        student02.sex = 'M';

        show.show(student01);
        show.show(student02);
    }
}
