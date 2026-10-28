package day23.practice;

import java.time.LocalDate;
import java.time.Period;

public class Practice1EmployeeExperience {

    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2020, 8, 17);
        LocalDate currentDate = LocalDate.now();

        System.out.println("Joining Date: " +joiningDate );
        System.out.println("Current Date: " +currentDate );

        Period experience = Period.between(joiningDate, currentDate);

        System.out.println(
                "Experience: " + experience.getYears() + " years, "
                        + experience.getMonths() + " months, "
                        + experience.getDays() + " days"
        );

        System.out.println("Total Months: " + experience.toTotalMonths());
    }
}
