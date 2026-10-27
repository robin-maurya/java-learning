package day23.concepts;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();

        LocalDateTime joiningDateTime = LocalDateTime.of(202, 8, 17, 10, 30);

        System.out.println("Current Date and Time: " +currentDateTime);
        System.out.println("Joining Date and Time: " + joiningDateTime);


        System.out.println("Year: " +joiningDateTime.getYear());
        System.out.println("Month: " + joiningDateTime.getMonthValue());
        System.out.println("Hour: " +joiningDateTime.getHour());
        System.out.println("Minute: " + joiningDateTime.getMinute());
    }
}
