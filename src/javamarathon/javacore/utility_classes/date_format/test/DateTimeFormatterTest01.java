package javamarathon.javacore.utility_classes.date_format.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // Gets the current date (no time)

        // Formats the current date in ISO basic format: yyyyMMdd (e.g., 20251016)
        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));

        // Formats the current date in ISO local format: yyyy-MM-dd (e.g., 2025-10-16)
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));

        // Parses a date from a basic ISO string (yyyyMMdd) to a LocalDate
        LocalDate parse1 = LocalDate.parse("20251016", DateTimeFormatter.BASIC_ISO_DATE);

        // Parses a date string in extended ISO format (includes time zone offset)
        LocalDate parse2 = LocalDate.parse("2025-10-16-03:00", DateTimeFormatter.ISO_DATE);

        // Prints the parsed dates (default toString format is ISO: yyyy-MM-dd)
        System.out.println(parse1);
        System.out.println(parse2);

        // Custom formatter for Brazilian pattern: dd/MM/yyyy
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formats current date using Brazilian pattern
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);

        // Parses a Brazilian-formatted date string into a LocalDate
        LocalDate parseBR = LocalDate.parse("16/10/2025", formatterBR);
        System.out.println(parseBR); // Printed in ISO format (yyyy-MM-dd)
    }
}
