package javamarathon.javacore.utility_classes.date.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 12,10);
        LocalDate now = LocalDate.now();

        Period period = Period.between(now, birthday);
        System.out.println(period);
        System.out.println(ChronoUnit.DAYS.between(birthday, now));
        System.out.println(ChronoUnit.WEEKS .between(birthday, now));
        System.out.println(ChronoUnit.MONTHS.between(birthday, now));
        System.out.println(ChronoUnit.YEARS.between(birthday, now));
    }
}
