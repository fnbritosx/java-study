package devbrito.marathonjava.javacore.association.test;

import devbrito.marathonjava.javacore.association.domain.LocationSeminar;
import devbrito.marathonjava.javacore.association.domain.Seminar;
import devbrito.marathonjava.javacore.association.domain.StudentSeminar;
import devbrito.marathonjava.javacore.association.domain.TeacherSeminar;

import java.util.ArrayList;
import java.util.List;

public class ExerciseSeminarTest {
    public static void main(String[] args) {
        LocationSeminar locationSeminar01 = new LocationSeminar("Saquarema");
        LocationSeminar locationSeminar02 = new LocationSeminar("São Gonçalo");

        Seminar seminar01 = new Seminar("Relationship Java and Minecraft", locationSeminar01);
        Seminar seminar02 = new Seminar("Relationship Java and Minecraft", locationSeminar02);

        TeacherSeminar teacherSeminar01 = new TeacherSeminar("Fernando", "Java");
        TeacherSeminar teacherSeminar02 = new TeacherSeminar("DevDojo", "Spring");
        TeacherSeminar teacherSeminar03 = new TeacherSeminar("Robson Cesar", "Python");
        TeacherSeminar teacherSeminar04 = new TeacherSeminar("Gustavo Guanabara", "Pandas");

        List<TeacherSeminar> teachers = new ArrayList<>();
        teachers.add(teacherSeminar01);
        teachers.add(teacherSeminar02);
        teachers.add(teacherSeminar03);
        teachers.add(teacherSeminar04);


        StudentSeminar studentSeminar01 = new StudentSeminar("Miguel", 14);
        StudentSeminar studentSeminar02 = new StudentSeminar("João", 20);
        StudentSeminar studentSeminar03 = new StudentSeminar("Maria", 17);
        StudentSeminar studentSeminar04 = new StudentSeminar("José", 60);

        List<StudentSeminar> students = new ArrayList<>();
        students.add(studentSeminar01);
        students.add(studentSeminar02);
        students.add(studentSeminar03);
        students.add(studentSeminar04);

        seminar01.setTeacher(teachers);
        seminar01.setStudent(students);

        seminar02.setTeacher(teachers);
        seminar02.setStudent(students);

        seminar01.seminarPrinter();
        System.out.println("--------------------");
        seminar02.seminarPrinter();
    }
}
