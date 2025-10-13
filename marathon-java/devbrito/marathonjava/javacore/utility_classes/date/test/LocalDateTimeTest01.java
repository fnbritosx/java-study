package devbrito.marathonjava.javacore.utility_classes.date.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.parse("2024-10-12");
        LocalTime localTime = LocalTime.parse("09:42:54");

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime localDateTime1 = localDate.atTime(localTime);
        LocalDateTime localDateTime2 = localTime.atDate(localDate);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
