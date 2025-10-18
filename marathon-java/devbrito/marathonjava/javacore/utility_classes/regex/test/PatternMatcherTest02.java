package devbrito.marathonjava.javacore.utility_classes.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d - all digits of the text.
        // \D - all non-digits of the text.
        // \s - all white spaces and scape character (e.g., character escape: \t - TAB, \n - line break, \f - reset line
        // (everything that comes after will be overwritten from the first line), \r - advance the page).
        // \S - all characters except whitespaces
        //w - aA - zZ, digits, _ (excludes special characters).
        //W - only special characters.

        String text = "a81dj9_1@k sl02mzx88@ qwe77";
        String regex = "\\W";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text: " + text);
        System.out.println("Regex: " + regex);

        System.out.println("Start Regex: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " - " + matcher.group() + "   ");
        }
    }
}
