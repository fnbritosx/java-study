package devbrito.marathonjava.introduction;

/**
 * <b>byte</b> == 1 byte (-128 a 127) <br><br>
 * <b>short</b> == 2 bytes (-32.768 a 32.767) <br><br>
 * <b>int</b> == 4 bytes (-2.147.483.648 a 2.147.483.647) <br><br>
 * <b>long</b> == 8 bytes (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807) <br><br>
 * <b>float</b> == 4 bytes (±1.4E-45 a ±3.4E+38) <br><br>
 * <b>double</b> == 8 bytes (±4.9E-324 a ±1.7E+308) <br><br>
 * <b>char</b> == 2 bytes (de 0 a 65.535 — represents Unicode characters) <br><br>
 * <b>boolean</b> == depends on the JVM (false or true) <br><br>
 */

public class Class02PrimitiveTypes {
    public static void main(String[] args) {

        byte yearByte = 127;
        short yearShort = 3200;
        int age = 18;
        long numberSmall = 100000L;
        float salaryFloat = 2500f;
        double salaryDouble = 2000;
        char character = 'M'; // letter M (Unicode code 77)
        boolean truth = true;
        boolean lie = false;

        System.out.printf("Age is %d years %n", age);
        System.out.printf("The big number: %d %n", numberSmall);
        System.out.printf("The small salary : $%.2f%n", salaryDouble);
        System.out.println("Gender: " + character);
        System.out.println(lie);

        // CASTING

        double smallNumber = 9.5;
        int truncate = (int) smallNumber; // truncate number

        System.out.println(truncate);
    }
}
