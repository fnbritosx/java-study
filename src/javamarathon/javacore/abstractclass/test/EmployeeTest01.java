package javamarathon.javacore.abstractclass.test;

import javamarathon.javacore.abstractclass.domain.Developer;
import javamarathon.javacore.abstractclass.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Developer developer = new Developer("Fernando", 5000);
        Manager manager = new Manager("FN", 3000);

        System.out.println(developer);
        System.out.println(manager);
        developer.printer();
        manager.printer();
    }
}
