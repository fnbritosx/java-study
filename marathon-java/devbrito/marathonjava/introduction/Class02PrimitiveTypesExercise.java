package devbrito.marathonjava.introduction;
/*
PRACTICE

create variables for the fields described below between <> and print the following message:
I <name>, living in address <address>,
I confirm that I received the salary $<salary> on date, date>
 */
public class Class02PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Fernando";
        String address = "Road Miltan da Cunha Vaz";
        double salary = 2354.64;
        String date = "15/08/2025";
        String report = String.format("I %s, living in address %s %nI confirm that I received the salary $%.2f on date, %s", name,
        address, salary, date);

        System.out.printf(report);
    }
}
