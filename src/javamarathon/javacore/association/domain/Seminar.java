package javamarathon.javacore.association.domain;

import java.util.ArrayList;
import java.util.List;

public class Seminar {
    private String title;
    private LocationSeminar locationSeminar;
    private List<TeacherSeminar> teacherSeminar = new ArrayList<>();
    private List<StudentSeminar> studentSeminar = new ArrayList<>();


    public Seminar(String title, LocationSeminar locationSeminar) {
        this.title = title;
        this.locationSeminar = locationSeminar;
    }

    public Seminar(String title, LocationSeminar locationSeminar, List<TeacherSeminar> teacherSeminar) {
        this(title, locationSeminar);
        this.teacherSeminar = teacherSeminar;
    }
    public  void seminarPrinter(){
        System.out.println("Title: " + title);
        System.out.println("Location: " + locationSeminar.getAddress());

        if (!teacherSeminar.isEmpty()){
            System.out.println("Teacher(s): ");
            for(TeacherSeminar teacher : teacherSeminar){
                System.out.print(teacher.getName() + " ");
            }
            System.out.println();
        }
        if (!studentSeminar.isEmpty()){
            System.out.println("Student(s): ");
            for(StudentSeminar student : studentSeminar){
                System.out.print(student.getName() + " ");
            }
            System.out.println();
        }
    }
        public void setTeacher(List<TeacherSeminar> teacherSeminar) {
            this.teacherSeminar = teacherSeminar;
        }

    public void setStudent(List<StudentSeminar> studentSeminar) {
        this.studentSeminar = studentSeminar;
    }

    public String getTitle() {
        return title;
    }
}
