package day23.concepts;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate joiningDate = LocalDate.of(2020, 8, 17);

        System.out.println("Today's Date: " + today);
        System.out.println("Joining Date: " + joiningDate);

        System.out.println("Year: " + joiningDate.getYear());
        System.out.println("Month: " + joiningDate.getMonthValue());
        System.out.println("Day: " + joiningDate.getDayOfMonth());


    }
}
