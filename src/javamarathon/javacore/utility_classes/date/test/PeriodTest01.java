package javamarathon.javacore.utility_classes.date.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);

        Period period = Period.between(now, nowAfterTwoYears);
        Period p1 = Period.ofDays(10);
        Period p2 = Period.ofMonths(12);
        Period p3 = Period.ofYears(2005);
        Period p4 = Period.ofWeeks(60);


        System.out.println(period);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4); //print in days
        System.out.println(p4.getMonths()); // The number of months is zero because weeks are internally converted only into days.
                                            // to convert to months, use the ChronoUnity class.
    }
}
