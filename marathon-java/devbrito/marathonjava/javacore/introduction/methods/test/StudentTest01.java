package devbrito.marathonjava.javacore.introduction.methods.test;

import devbrito.marathonjava.javacore.introduction.methods.domain.ShowStudent;
import devbrito.marathonjava.javacore.introduction.methods.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        ShowStudent write = new ShowStudent();

        student01.name = "Fernando";
        student01.age = 19;
        student01.sex = 'M';

        student02.name = "Miguel";
        student02.age = 14;
        student02.sex = 'M';

        write.show(student01);
        write.show(student02);

    }
}
