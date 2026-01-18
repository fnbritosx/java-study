package javamarathon.javacore.inheritance.test;

import javamarathon.javacore.inheritance.domain.Address;
import javamarathon.javacore.inheritance.domain.Employee;
import javamarathon.javacore.inheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
    // 1 - Static blocks from the superclass are executed once (when the class is loaded)
    // 2 - Static blocks from the subclass are executed once (when the class is loaded)

    // ↓ Object creation starts ↓

    // 3 - Memory is allocated for the subclass object (includes superclass part)
    // 4 - Instance attributes from the superclass are initialized (default → explicit)
    // 5 - Instance initialization blocks from the superclass are executed
    // 6 - Constructor from the superclass is executed

    // 7 - Instance attributes from the subclass are initialized (default → explicit)
    // 8 - Instance initialization blocks from the subclass are executed
    // 9 - Constructor from the subclass is executed


        Address address = new Address("Road Irelia is broken", 244244-169);
        Person person = new Person("Bené", "123.456.789-01", 20);

        Employee employee = new Employee("Fehgol", "169.169.169.57", 30, 5000);

        person.printer();
        System.out.println("----------");
        employee.printer();
        System.out.println("----------");
        employee.paymentReport();

    }
}
