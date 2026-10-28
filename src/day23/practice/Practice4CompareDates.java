package day23.practice;

import java.time.LocalDate;
import java.time.Period;

public class Practice4CompareDates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2025,1, 15);
        LocalDate date2 = LocalDate.of(2026,6, 20);

        System.out.println("Date1 is before Date2: " + date1.isBefore(date2));
        System.out.println("Date1 is after Date2: " + date1.isAfter(date2));
        System.out.println("Dates are equal: " + date1.isEqual(date2));

        Period difference = Period.between(date1, date2);

        System.out.println("Difference: "
                + difference.getYears() + " years, "
                + difference.getMonths() + " months, "
                + difference.getDays() + " days");
    }
}
