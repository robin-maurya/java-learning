package day23.concepts;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2020, 8, 17);
        LocalDate currentDate = LocalDate.of(2026, 10, 26);

        Period experience = Period.between(joiningDate, currentDate);

        System.out.println("Years: " + experience.getYears());
        System.out.println("Months: " + experience.getMonths());
        System.out.println("Days: " + experience.getDays());

        System.out.println("Total Months: " + experience.toTotalMonths());
    }
}
