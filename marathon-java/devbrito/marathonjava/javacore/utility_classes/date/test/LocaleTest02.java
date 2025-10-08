package devbrito.marathonjava.javacore.utility_classes.date.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        Locale aDefault = Locale.getDefault();
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        System.out.println(aDefault);

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }
        System.out.println();
    }
}
