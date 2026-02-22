package javamarathon.javacore.designpattern.domain.person;

public class Person {
    private String firstName;
    private String lastName;
    private String nickName;
    private String email;

    private Person(String firstName, String lastName, String nickName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String nickName;
        private String email;

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;

            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;

            return this;
        }

        public PersonBuilder nickName(String nickName) {
            this.nickName = nickName;

            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;

            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, nickName, email);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
