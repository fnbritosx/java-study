package devbrito.marathonjava.javacore.classes.test;

import devbrito.marathonjava.javacore.classes.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Musashi";
        teacher.age = 30;
        teacher.sex = 'M';

        System.out.printf("Name: %s%nAge: %d%nSex: %s%n", teacher.name, teacher.age,teacher.sex);
    }
}
