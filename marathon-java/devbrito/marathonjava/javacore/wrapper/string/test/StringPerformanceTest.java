package devbrito.marathonjava.javacore.wrapper.string.test;

public class StringPerformanceTest {
    public static void main(String[] args) {

        long startString = System.currentTimeMillis();
        concatString(300_000);
        long endString = System.currentTimeMillis();
        System.out.println("Time String: " + (endString - startString) + "ms");

        long startStringBuilder = System.currentTimeMillis();
        concatStringBuilder(300_000);
        long endStringBuilder = System.currentTimeMillis();
        System.out.println("Time String Builder: " + (endStringBuilder - startStringBuilder) + "ms");

        long startStringBuffer = System.currentTimeMillis();
        concatStringBuffer(300_000);
        long endStringBuffer = System.currentTimeMillis();
        System.out.println("Time String Buffer: " + (endStringBuffer - startStringBuffer) + "ms");
    }

    public static void concatString(int size) {
        String test = "";
        for (int i = 0; i < size; i++) {
            test += i;
        }
    }

    public static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }
}
