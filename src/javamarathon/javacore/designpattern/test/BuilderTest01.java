package javamarathon.javacore.designpattern.test;

import javamarathon.javacore.designpattern.domain.person.Person;

public class BuilderTest01 {
    public static void main(String[] args) {
        // Person person = new Person("Fernando", "Brito", "Bene", "fnbritodev@gmail.com");

        Person build = new Person.PersonBuilder()
                .firstName("Fernando")
                .lastName("Brito")
                .nickName("Bene")
                .email("fnbritodev@gmail.com")
                .build();

        System.out.println(build);
    }
}
