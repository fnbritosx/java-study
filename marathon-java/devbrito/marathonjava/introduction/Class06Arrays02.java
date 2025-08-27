package devbrito.marathonjava.introduction;

public class Class06Arrays02 {
    public static void main(String[] args) {
        // Default values for array elements:
        // Primitive types: short, int, long, float, and double = 0
        // char = '\u0000' (null character, printed as a blank space)
        // boolean = false
        // Reference types (like String) = null

        String[] name = new String[3];
        System.out.println(name[0]);

        int[] numbers = new int[3];
        System.out.println(numbers[0]);

        boolean[] flags = new boolean[2];
        System.out.println(flags[0]);
    }
}
