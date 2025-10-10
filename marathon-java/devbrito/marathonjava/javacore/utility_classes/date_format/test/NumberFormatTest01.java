package devbrito.marathonjava.javacore.utility_classes.date_format.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        NumberFormat[] numberFormat = new NumberFormat[3];

        Locale localeBR = Locale.forLanguageTag("pt-BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeCH = Locale.CHINESE;

        numberFormat[0] = NumberFormat.getInstance(localeBR);
        numberFormat[1] = NumberFormat.getInstance(localeJP);
        numberFormat[2] = NumberFormat.getInstance(localeCH);

        double value = 100_000.212;
        for (NumberFormat format : numberFormat) {
            System.out.println(format.format(value));
        }

    }
}
