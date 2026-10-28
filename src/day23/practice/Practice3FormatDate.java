package day23.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice3FormatDate {

    public static void main(String[] args){

        LocalDate date = LocalDate.of(2020, 8, 17);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formattedDate = date.format(formatter);


        DateTimeFormatter formatter1 =
                DateTimeFormatter.ofPattern("dd MMM yyyy");

        String formattedDate1 = date.format(formatter1);

        System.out.println("Original Date: " + date);
        System.out.println("Formatted Date (Numeric): " + formattedDate);
        System.out.println("Formatted Date (Month Name): " + formattedDate1);
    }
}

