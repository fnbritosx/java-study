package devbrito.maratonajava.introducao;

public class Class04ConditionalStructures04Exercise {
    public static void main(String[] args) {
        // PRACTICE

        // I want to know how much tax would be paid to the European government.
        // Take into consideration:

        // Tax brackets:
        // From €0 to €34,712 → 9.70%
        // From €34,713 to €68,507 → 37.35%
        // Above €68,507 → 49.50%

        double salary = 70000;
        double tax = 0;

        if (salary >= 0 && salary <= 34712) {
            tax = salary * 0.3735;
        } else if (salary >= 34713 && salary <= 68507) {
            tax = salary * 0.3735;
        } else {
            tax = salary * 0.495;
        }

        System.out.println("Salary: €" + salary);
        System.out.println("Total tax: €" + tax);
    }
}
