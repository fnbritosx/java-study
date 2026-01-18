package javamarathon.javacore.utility_classes.date.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());

        LocalDate date = LocalDate.of(2024,12, 10);

        System.out.println(date);

        //methods LocalDate
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());

        // add date
        LocalDate now = LocalDate.now();
        System.out.println(now);
        now = now.plusDays(5);
        System.out.println(now);
    }
}
