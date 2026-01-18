package javamarathon.javacore.methods.domain;

public class WriteGivenEmployee {
    public void write(Employee employee){
        System.out.println(employee.name);
        System.out.println(employee.age);

        float count = 0;
        for (int i =0; i < employee.salary.length; i++) {
            System.out.printf("Salary %d: %.2f%n", i + 1, employee.salary[i]);
            count += employee.salary[i];
        }
    }
}
