package devbrito.marathonjava.javacore.methods.test;

import devbrito.marathonjava.javacore.methods.domain.AverageSalariesEmployee;
import devbrito.marathonjava.javacore.methods.domain.Employee;
import devbrito.marathonjava.javacore.methods.domain.WriteGivenEmployee;

public class EmployeeExercise {
    public static void main(String[] args) {
        // create one class employee with the following attributes - name, age, three salaries.
        // create two methods:
        // 1- For print the given.
        // 2- For take the average of the salaries e print the result
        Employee employee = new Employee();
        AverageSalariesEmployee salaries = new AverageSalariesEmployee();
        WriteGivenEmployee write = new WriteGivenEmployee();

        employee.name = "Fernando";
        employee.age = 19;
        employee.salary = new float[] {1250.34f, 1500f, 1700f};

        write.write(employee);
        salaries.salariesAverage(employee.salary);

    }
}
