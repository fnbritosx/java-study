package javamarathon.javacore.utility_classes.date.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 59, 59);
        LocalTime timeNow = LocalTime.now();

        System.out.println(time);
        System.out.println(timeNow);

        timeNow = timeNow.plusHours(4);
        System.out.println(timeNow);

        System.out.println(timeNow.get(ChronoField.HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
