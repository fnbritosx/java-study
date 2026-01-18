package javamarathon.javacore.utility_classes.date_format.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        NumberFormat[] numberFormat = new NumberFormat[4];

        Locale localeBR = Locale.forLanguageTag("pt-BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeCH = Locale.CHINESE;
        Locale localeIT = Locale.ITALY;

        numberFormat[0] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormat[1] = NumberFormat.getCurrencyInstance(localeIT);
        numberFormat[2] = NumberFormat.getCurrencyInstance(localeCH);
        numberFormat[3] = NumberFormat.getCurrencyInstance(localeJP);

        double value = 100_000.212;
        for (NumberFormat format : numberFormat) {
            format.setMaximumFractionDigits(2);
            System.out.println(format.format(value));
        }

        String value1 = "R$\u00A0100.000,212";

        try {
            System.out.println(numberFormat[0].parse(value1));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
