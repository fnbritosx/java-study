package javamarathon.javacore.utility_classes.string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "      Fernando               ";
        String numbers = "012345";

        System.out.println(name.charAt(0)); // prints the character at index 0
        System.out.println(name.length()); // prints the length of the string
        System.out.println(name.replace("o", "a")); // replaces the old characters with the new ones
        System.out.println(name.toLowerCase()); // converts all characters to lowercase
        System.out.println(name.toUpperCase()); // converts all characters to uppercase
        System.out.println(name.trim()); // removes leading and trailing spaces

        System.out.println("--------------------");

        System.out.println(numbers.length()); // prints the length of the string
        System.out.println(numbers.substring(0, 3)); // extracts substring from index 0 to 2
        System.out.println(numbers.substring(0, 4)); // extracts substring from index 0 to 3
    }
}
