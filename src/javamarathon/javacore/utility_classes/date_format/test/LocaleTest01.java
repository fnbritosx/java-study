package javamarathon.javacore.utility_classes.date_format.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //pt-BR
        Locale localeSW = Locale.forLanguageTag("it-CH");
        Locale localeBR = Locale.forLanguageTag("pt-BR");
        Locale localeIndia = Locale.forLanguageTag("hi-IN");
        Locale localeJapan = Locale.forLanguageTag("ja-JP");

        DateFormat dateFormatCH = DateFormat.getDateInstance(DateFormat.FULL, localeSW);
        DateFormat dateFormatBR = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat dateFormatIN = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormatJP = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);

        Calendar calendar = Calendar.getInstance();

        System.out.println("Switzerland: " + dateFormatCH.format(calendar.getTime()));
        System.out.println("Brazil: " + dateFormatBR.format(calendar.getTime()));
        System.out.println("India: " + dateFormatIN.format(calendar.getTime()));
        System.out.println("Japan: " + dateFormatJP.format(calendar.getTime()));
    }
}
