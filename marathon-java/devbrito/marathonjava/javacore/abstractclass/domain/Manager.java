package devbrito.marathonjava.javacore.abstractclass.domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double calculateBonus() {
        return baseSalary * 0.05;
    }
}
