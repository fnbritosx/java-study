package devbrito.marathonjava.javacore.dataentry;

import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter you age: ");
        int age = input.nextInt();

        System.out.print("Enter your sex: ");
        char sex = input.next().charAt(0);

        System.out.println("Name " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }
}
