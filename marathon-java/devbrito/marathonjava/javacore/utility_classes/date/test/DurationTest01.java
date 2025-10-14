package devbrito.marathonjava.javacore.utility_classes.date.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime dateNow = LocalDateTime.now();
        LocalDateTime dateAfterTwoYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration date = Duration.between(dateNow, dateAfterTwoYears);
        System.out.println(date);

        Duration time = Duration.between(timeNow, timeMinus7Hours);
        System.out.println(time);

        Duration secNow = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(secNow);

        Duration d1 = Duration.of(3, ChronoUnit.NANOS);
        System.out.println(d1);
    }
}
