package javamarathon.javacore.inheritance.domain;

public class Employee extends Person{
    private double salary;

    public Employee(String name, String cpf, int age, double salary) {
        super(name, cpf, age);
        this.salary = salary;
    }

    public void printer(){
        super.printer();
        System.out.println("Salary: " + salary);
    }

    public void paymentReport(){
        System.out.printf("I, %s, confirm receipt of the salary this month: $%.2f%n", this.name, salary);
    }
}
