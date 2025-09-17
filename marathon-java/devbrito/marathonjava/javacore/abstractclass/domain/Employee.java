package devbrito.marathonjava.javacore.abstractclass.domain;

public abstract class Employee extends Person{
    protected String name;
    protected double baseSalary;
    protected double bonus;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = calculateBonus();
    }

    @Override
    public void printer() {
        System.out.println("Printing...");
    }

    public abstract double calculateBonus();

    public double getTotalSalary(){
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                ", salary total=" + getTotalSalary() +
                '}';
    }
}


