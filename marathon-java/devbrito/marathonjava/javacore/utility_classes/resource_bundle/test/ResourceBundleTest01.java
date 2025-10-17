package devbrito.marathonjava.javacore.utility_classes.resource_bundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        // Locale("en", "US") will search for files in the following order:
        // messages_en_US.properties
        // messages_en.properties
        // messages_pt_BR.properties // for Brazilian Portuguese locale
        // messages_pt.properties
        // messages.properties (default)

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", Locale.of("en", "US"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
        System.out.println(resourceBundle.getString("hi"));

        resourceBundle = ResourceBundle.getBundle("messages", Locale.of("pt", "BR"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
        System.out.println(resourceBundle.getString("hi"));
    }
}
