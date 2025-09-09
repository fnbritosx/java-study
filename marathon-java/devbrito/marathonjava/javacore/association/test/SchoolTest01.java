package devbrito.marathonjava.javacore.association.test;

import devbrito.marathonjava.javacore.association.domain.School;
import devbrito.marathonjava.javacore.association.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher01 = new Teacher("Kakashi Sensei");
        Teacher teacher02 = new Teacher("Jiraya Sensei");
        Teacher[] teachers = {teacher01, teacher02};

        School school = new School("Leaf Village", teachers);

       school.schoolPrinter();
    }
}
