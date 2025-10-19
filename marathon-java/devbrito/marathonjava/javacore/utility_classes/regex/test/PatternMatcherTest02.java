package devbrito.marathonjava.javacore.utility_classes.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // /d - all digits of the text.
        // \D - all non-digits of the text.
        // \s - all white spaces and scape character (e.g., character escape: \t - TAB, \n - line break, \f - reset line
        // (everything that comes after will be overwritten from the first line), \r - advance the page).
        // \S - all characters except whitespaces
        //w - aA - zZ, digits, _ (excludes special characters).
        //W - only special characters.
        // [] - range (e.g.: [a-z] - return characters from a to z lowercase).
        //hexadecimal numbers - strat "0x" or "0X" and must have a letter or number (0x1, 0Xf).
        // ? - zero or one occurrence.
        // * - zero or more occurrence.
        // + - one or more occurrence.
        // {n, m} - from n to m.
        // () - group.
        // | - or.
        // $ - end of line.
        // . - joker (e.g., 1.3 - 123, 133, 1@3, 1A3  etc.)
        // ^ - beginning of the line (outside brackets) OR negation (inside brackets)

        String text = "0x1F 0Xabc 0x 0xGHI 0x12345 0x0 0xZ12 0xDEADBEEF 0x1g3 0xFFF 0x12zzzzz";
        String regex = "0[xX][0-9a-fA-F]+(\\s|$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text: " + text);
        System.out.println("Regex: " + regex);

        System.out.println("Start Regex: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " - " + matcher.group() + "   ");
        }
        System.out.println();

        int hexNumber = 0xDEADBEEF;
        System.out.println(hexNumber);
    }
}
