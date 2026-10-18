package day19.practice;

import java.util.List;

public class Practice5CollectEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35, 21);

         List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

         System.out.println(evenNumbers);
    }
}
