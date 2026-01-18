package javamarathon.javacore.throwable.exception.test;

import javamarathon.javacore.throwable.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginTest01 {
    public static void main(String[] args) throws InvalidLoginException {
        try {
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    public static void login() throws InvalidLoginException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "fn";
        String passwordDB = "123";
        System.out.println("Username: ");
        String usernameUser = scanner.nextLine();
        System.out.println("Password: ");
        String passwordUser = scanner.nextLine();

        if (!usernameDB.equals(usernameUser) || !passwordDB.equals(passwordUser)) {
            throw new InvalidLoginException("Username or password invalid");
        }
        System.out.println("User logged in successfully");
    }
}
