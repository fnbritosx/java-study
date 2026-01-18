package javamarathon.javacore.utility_classes.date.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {

        // Prints a map of legacy short zone IDs to full zone IDs
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        // Prints the default system time zone of the machine
        System.out.println(ZoneId.systemDefault());

        // Creates a ZoneId for Tokyo (Asia/Tokyo)
        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneTokyo);

        // Gets the current ZonedDateTime for Tokyo using system clock
        ZonedDateTime now = ZonedDateTime.now(zoneTokyo);
        System.out.println(now);

        // Gets the current UTC instant and converts it to Tokyo time zone
        Instant nowAgain = Instant.now(); // UTC no time zone
        ZonedDateTime zoneTk = nowAgain.atZone(zoneTokyo);
        System.out.println(zoneTk);

        // Creates an OffsetDateTime using UTC and a manual offset of -09:00 (e.g: Hawaii)
        ZoneOffset zoneHavai = ZoneOffset.of("-09:00");
        OffsetDateTime offsetDateTimeHavai = nowAgain.atOffset(zoneHavai);
        System.out.println(offsetDateTimeHavai);

        // Converts the current LocalDate to the Japanese calendar system
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        // Converts a historical date (1900-01-01) to the Japanese calendar system
        LocalDate eraJapanese = LocalDate.of(1900, 1, 1);
        JapaneseDate eraJapaneseDate = JapaneseDate.from(eraJapanese);
        System.out.println(eraJapaneseDate);
    }
}
