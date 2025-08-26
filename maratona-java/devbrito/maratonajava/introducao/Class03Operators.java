package devbrito.maratonajava.introducao;

import java.util.Scanner;

public class Class03Operators {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        // Casting to double to get a decimal result
        double result = number01 / (double) number02;
        System.out.println("Arithmetic result (number01 / number02): " + result);

        // % (Modulus operator)
        int remainder = 21 % 7;
        System.out.println("Remainder of 21 % 7: " + remainder);

        // < > <= >= == != (comparison operators, return boolean values)
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsToTwenty = 10 == 10.0;
        boolean isTenNotEqualsToTwenty = 10 != 10.0;

        System.out.println("Ten is greater than twenty? " + isTenGreaterThanTwenty);
        System.out.println("Ten is less than twenty? " + isTenLessThanTwenty);
        System.out.println("Ten is equal to twenty? " + isTenEqualsToTwenty);
        System.out.println("Ten is not equal to twenty? " + isTenNotEqualsToTwenty);

        // && (AND) || (OR) ! (NOT)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Is your CPF blocked? (true/false): ");
        boolean cpfBlocked = scanner.nextBoolean();

        System.out.print("Are you emancipated? (true/false): ");
        boolean emancipated = scanner.nextBoolean();

        if (!cpfBlocked && (age >= 18 || emancipated)) {
            System.out.println("You can get your driver's license!");
        } else{
            System.out.println("You can't get your driver's license!");
        }
        scanner.close();

        // = += -= *= /= %=
        double salary = 3000;
        salary += 1000; // 4000
        salary -= 1000; // 3000
        salary *= 2; // 6000
        salary /= 2; // 3000
        salary %= 2; // 0

        System.out.println(salary);

        // ++ --
        int count = 0;
        count += 1; // count = count + 1;
        count ++; // Post-increment: executes first, then increments
        count --;
        ++ count; // Pre-increment: increments first, then executes
        -- count;

        System.out.println("Final count value: " + count);
    }
}
