package javamarathon.javacore.inheritance.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected int age;

    public Person(String name, String cpf, int age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

    public void printer(){
        System.out.println("Name: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Age: " + age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
