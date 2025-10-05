package devbrito.marathonjava.javacore.utility_classes.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Fernando";
        name.concat("Brito");
        System.out.println(name.substring(0, 3));
        System.out.println(name);

        StringBuilder sb = new StringBuilder("Fernando Brito");
        sb.append(" Neto").append(" - Dev Jr");

        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);

        System.out.println(sb);


    }
}
