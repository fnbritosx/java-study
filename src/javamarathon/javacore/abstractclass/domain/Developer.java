package javamarathon.javacore.abstractclass.domain;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.10;
    }

}
