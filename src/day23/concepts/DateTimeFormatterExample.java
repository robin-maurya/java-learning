package day23.concepts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, 8, 17);

        //1st Pattern
//        DateTimeFormatter formatter =
//                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        //2nd Pattern

//        DateTimeFormatter formatter =
//                DateTimeFormatter.ofPattern("dd/MM/yyyy");


        //3rd Pattern
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd MMMM yyyy");

        String formattedDate = date.format(formatter);

        System.out.println("Original Date: " + date);
        System.out.println("Formatted Date: " + formattedDate);

        LocalDateTime dateTime =
                LocalDateTime.of(2020, 8, 17, 10, 30);

        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm");

        System.out.println("Formatted DateTime: "
                + dateTime.format(dateTimeFormatter));
    }
}
