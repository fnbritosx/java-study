package devbrito.marathonjava.javacore.introduction.methods.test;

import devbrito.marathonjava.javacore.introduction.methods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Fernando");
        person.setAge(19);

        person.printPerson();

        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
