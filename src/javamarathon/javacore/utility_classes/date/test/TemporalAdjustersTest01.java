package javamarathon.javacore.utility_classes.date.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
        System.out.println(now.getDayOfWeek());
    }
}
