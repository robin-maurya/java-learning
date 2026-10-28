package day23.practice;

import java.time.LocalDate;

public class Practice5AddDays {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2026, 10, 29);


        System.out.println(date.plusDays(10));
        System.out.println(date.minusMonths(2));
    }
}
