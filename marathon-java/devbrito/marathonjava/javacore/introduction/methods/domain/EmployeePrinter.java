package devbrito.marathonjava.javacore.introduction.methods.domain;

public class EmployeePrinter {
    public void write(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());

        float[] salary = employee.getSalary();

        if (salary != null && salary.length != 0) {
            for (int i = 0; i < salary.length; i++) {
                System.out.printf("Salary %d: %.2f%n", i + 1, salary[i]);
            }
        }
    }
}
