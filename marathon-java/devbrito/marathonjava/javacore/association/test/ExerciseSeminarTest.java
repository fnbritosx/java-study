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
        Seminar seminar02 = new Seminar("Python for Big Data", locationSeminar02);

        TeacherSeminar teacherSeminar01 = new TeacherSeminar("Fernando", "Java");
        TeacherSeminar teacherSeminar02 = new TeacherSeminar("DevDojo", "Spring");
        TeacherSeminar teacherSeminar03 = new TeacherSeminar("Robson Cesar", "Python");
        TeacherSeminar teacherSeminar04 = new TeacherSeminar("Gustavo Guanabara", "Pandas");

        List<TeacherSeminar> teachers1 = new ArrayList<>();
        teachers1.add(teacherSeminar01);
        teachers1.add(teacherSeminar02);

        List<TeacherSeminar> teachers2 = new ArrayList<>();
        teachers2.add(teacherSeminar03);
        teachers2.add(teacherSeminar04);

        for(TeacherSeminar teacher : teachers1){
            teacher.setSeminar(seminar01);
        }
        for(TeacherSeminar teacher : teachers2){
            teacher.setSeminar(seminar02);
        }

        StudentSeminar studentSeminar01 = new StudentSeminar("Miguel", 14);
        StudentSeminar studentSeminar02 = new StudentSeminar("João", 20);
        StudentSeminar studentSeminar03 = new StudentSeminar("Maria", 17);
        StudentSeminar studentSeminar04 = new StudentSeminar("José", 60);

        List<StudentSeminar> students1 = new ArrayList<>();
        students1.add(studentSeminar01);
        students1.add(studentSeminar02);

        List<StudentSeminar> students2 = new ArrayList<>();
        students2.add(studentSeminar03);
        students2.add(studentSeminar04);

        for (StudentSeminar student : students1){
            student.setSeminar(seminar01);
        }
        for (StudentSeminar student : students2){
            student.setSeminar(seminar02);
        }

        seminar01.setTeacher(teachers1);
        seminar01.setStudent(students1);

        seminar02.setTeacher(teachers2);
        seminar02.setStudent(students2);

        seminar01.seminarPrinter();
        System.out.println("--------------------");
        seminar02.seminarPrinter();
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        teacherSeminar01.teacherPrinter();
        System.out.println("--------------------");
        teacherSeminar03.teacherPrinter();
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        studentSeminar01.studentPrinter();
        System.out.println("--------------------");
        studentSeminar03.studentPrinter();
    }
}
