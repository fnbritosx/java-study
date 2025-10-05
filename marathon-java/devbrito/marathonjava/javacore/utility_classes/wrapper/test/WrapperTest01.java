package devbrito.marathonjava.javacore.utility_classes.wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //CLASS 01
        float floatP = 2500f;
        double doubleP = 2000;
        char charP = 'W';
        boolean booleanP = true;

        Byte byteW = 127;
        Short shortW = 3200;
        Integer intW = 18; //autoboxing - type primitive for type wrapper.
        Long longW = 100000L;
        Float floatW = 2500f;
        Double doubleW = 2000D;
        Character charW = 'W';
        Boolean booleanW = true;

        //CLASS 02
        int i = intW; //unboxing - type wrapper for type primitive.
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
