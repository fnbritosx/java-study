package devbrito.marathonjava.javacore.wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        float floatP = 2500f;
        double doubleP = 2000;
        char charP = 'W';
        boolean booleanP = true;

        Byte byteW = 127;
        Short shortW = 3200;
        Integer intW = 18; //autoboxing
        Long longW = 100000L;
        Float floatW = 2500f;
        Double doubleW = 2000D;
        Character charW = 'W';
        Boolean booleanW = true;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean trueB = Boolean.parseBoolean("null");
        System.out.println(trueB);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLetterOrDigit('2'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('B'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('b'));
    }
}
