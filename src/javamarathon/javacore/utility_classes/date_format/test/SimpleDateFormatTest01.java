package javamarathon.javacore.utility_classes.date_format.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Saquarema:' dd.MM.yyyy"; //customizable
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Saquarema: 10.10.2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
