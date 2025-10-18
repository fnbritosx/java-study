package devbrito.marathonjava.javacore.utility_classes.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String text = "abaababa";
        String regex = "ab";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text: " + text);
        System.out.println("Regex: " + regex);

        System.out.print("Start Regex: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
