package devbrito.marathonjava.javacore.utility_classes.date.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class ExerciseDate01 {
    static class newDay implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int addDays;
            switch (dayOfWeek) {
                case THURSDAY:
                    addDays = 4;
                    break;
                case FRIDAY:
                    addDays = 3;
                    break;
                case SATURDAY:
                    addDays = 2;
                    break;
                default:
                    addDays = 1;
            }
            return temporal.plus(addDays, ChronoUnit.DAYS);
        }
    }
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------");

        LocalDate nowAddDays = LocalDate.now().with(new newDay());
        System.out.println(nowAddDays);
        System.out.println(nowAddDays.getDayOfWeek());

        System.out.println("--------------------");

        LocalDate nowAddDays1 = LocalDate.now().withDayOfMonth(10).with(new newDay());
        System.out.println(nowAddDays1);
        System.out.println(nowAddDays1.getDayOfWeek());
    }
}
