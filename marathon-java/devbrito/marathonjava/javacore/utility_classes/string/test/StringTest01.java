package devbrito.marathonjava.javacore.utility_classes.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Fernando";
        String name1 = "Fernando";

        // " Brito" is a literal (stored in the pool).
        // "Fernando Brito" is created on the heap (new String).
        name = name.concat(" Brito");

        System.out.println(name == name1); // false (different objects)

        // Creates a new String object on the heap with the same content as the pool.
        // Internally, this object references the "Fernando" value already in the pool.
        String name3 = new String("Fernando");

        // intern() returns the reference from the String pool.
        // If the String does not exist in the pool, it is automatically added.
        System.out.println(name1 == name3.intern()); // true

        // equals() compares the content.
        System.out.println(name3.equals(name1)); // true
    }
}
